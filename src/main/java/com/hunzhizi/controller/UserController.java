package com.hunzhizi.controller;

import com.hunzhizi.controller.results.Code;
import com.hunzhizi.controller.results.Result;
import com.hunzhizi.domain.User;
import com.hunzhizi.service.UserService;
import com.hunzhizi.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 魂之子
 * @program: springMVC
 * @create: 2022-04-12 13:16
 * @description:
 */
@RestController
@RequestMapping("/user")
//注意，在这里的命名，同你的控制器的作用相同，在这里是UserController 所以使用user作为一个根的访问路径
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public Result save(User user){
        boolean flag = userService.addUser(user);
        return new Result(flag ? Code.USER_SAVE_OK :Code.USER_SAVE_ERR);
    }

    @PostMapping("/update")
    public Result update( User user, MultipartFile img){
        if(!(img==null||img.isEmpty())){
            try {
                String addr = FileUtil.setFileAddr(user.getUserId(), img);
                img.transferTo(new File(addr));
                user.setProfileAddr(addr);
            } catch (IOException e) {
                e.printStackTrace();
                return new Result(Code.USER_UPDATE_ERR);
            }
        }
        System.out.println(FileUtil.setFileAddr(user.getUserId(),img));
        System.out.println(user.getBio());
        boolean flag = userService.updateUser(user);
        return new Result(flag?Code.USER_UPDATE_OK :Code.USER_UPDATE_ERR);
    }
    @RequestMapping(value = "/profile",method = RequestMethod.POST)
    public Result getProfile(String imgpath){
        File file = new File(imgpath);
        if(file.exists()){
            BufferedImage image = null;
            try {
                FileInputStream in = new FileInputStream(file);
                image = ImageIO.read(in);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
                return new Result(Code.PROFILE_GET_ERR);
            }
            return new Result(Code.PROFILE_GET_OK,image);
        }
        return new Result(Code.PROFILE_GET_ERR);
    }
//    @RequestMapping("/fileupload")
//    public Result update(  MultipartFile img){
//        if(img == null){
//            System.out.println("img is null");
//        }else {
//            System.out.println("ok");
//        }
//
//        return null;
//    }


    @GetMapping("/{userid}")
    public Result get(@PathVariable Integer userid){
        User user = userService.getUserById(userid);
        return (user!=null? new Result(Code.USER_GET_OK,user): new Result(Code.USER_GET_ERR));
    }

//    @GetMapping("/{pageNum}/{pageSize}")
//    public PageInfo<User> getAll(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
//        return userService.getAll(pageNum,pageSize);
//
//    }



}
