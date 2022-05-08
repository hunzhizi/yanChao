//package com.hunzhizi.service;
//
//import com.github.pagehelper.PageInfo;
//import com.hunzhizi.domain.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
///**
// * @author 魂之子
// * @program: springMVC
// * @create: 2022-04-13 10:48
// * @description:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//
//public class UserServiceTest {
//
//    //测试谁就注入谁
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void save(){
//
//        userService.save(new User(null,"hunzhizi5","zny51333","周少",1,new Date(12212112121121L)));
//
//    }
//    @Test
//    public void get(){
//        User user = userService.get(1);
//        System.out.println(user);
//    }
//    @Test
//    public void delete(){
//        boolean delete = userService.delete(5);
//
//    }
//
//    @Test
//    public void login(){
//        User login = userService.login("hunzhizi", "zny51333");
//        System.out.println(login);
//    }
//
//    @Test
//    public void getAll(){
//        PageInfo<User> all = userService.getAll(1,3);
//        List<User> list = all.getList();
//        for (User user : list) {
//            System.out.println(user);
//        }
//
//        System.out.println(all);
//
//    }
//
//    @Test
//    public void update(){
//        User user = new User(1, "hunzhizi", "zny", "周少", 1, new Date(12212112121121L));
//        user.setBirthday(new Date(8120L));
//        userService.update(user);
//    }
//}
