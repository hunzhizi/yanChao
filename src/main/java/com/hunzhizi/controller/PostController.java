package com.hunzhizi.controller;

import com.github.pagehelper.PageInfo;
import com.hunzhizi.controller.results.Code;
import com.hunzhizi.controller.results.Result;
import com.hunzhizi.domain.Post;
import com.hunzhizi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-02 11:34
 * @description:
 */
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/{userId}")
    public Result getPostByUserId(@PathVariable Integer userId) {
        if (userId == null) return new Result(Code.PASS_VALUE_ERR);
        List<Post> postByUserId = postService.getPostByUserId(userId);
        Date lastEditTime = postByUserId.get(0).getLastEditTime();
        System.out.println(lastEditTime);
        return new Result(Code.POST_GET_OK, postByUserId);
    }

    @DeleteMapping("/{postId}")
    public Result delPostByPostId(@PathVariable Integer postId) {
        if (postId == null) return new Result(Code.PASS_VALUE_ERR);
        boolean flag = postService.delPostByPostId(postId);
        return (flag ? new Result(Code.POST_DEL_OK) : new Result(Code.POST_DEL_ERR));
    }

    @PostMapping("/create")
    public Result createPost(Post post) {
        boolean flag = postService.createPost(post);
        return (flag ? new Result(Code.POST_SAVE_OK) : new Result(Code.POST_SAVE_ERR));
    }

    @GetMapping("/byPriority/{pageNum}/{pageSize}")
    public Result getPostByPriority(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        PageInfo<Post> pageInfo = postService.getPostByPriority(pageNum, pageSize);
        return (pageInfo != null
                ? new Result(Code.POST_GET_OK, pageInfo)
                : new Result(Code.POST_GET_ERR));

    }

    @GetMapping("/byLastEditTime/{pageNum}/{pageSize}")
    public Result getPostByLastEditTime(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        PageInfo<Post> pageInfo = postService.getPostByLastEditTime(pageNum, pageSize);
        return (pageInfo != null
                ? new Result(Code.POST_GET_OK, pageInfo)
                : new Result(Code.POST_GET_ERR));

    }

    @PostMapping("/update")
    public Result updatePost(Post post, MultipartFile... imgs){
        /**
         * 处理上传文件相关代码在此
         */
        boolean flag = postService.updatePost(post);
        return (flag ? new Result(Code.POST_UPDATE_OK) : new Result(Code.POST_UPDATE_ERR));
    }

}
