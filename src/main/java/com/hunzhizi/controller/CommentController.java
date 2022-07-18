package com.hunzhizi.controller;

import com.github.pagehelper.PageInfo;
import com.hunzhizi.controller.results.Code;
import com.hunzhizi.controller.results.Result;
import com.hunzhizi.domain.Comment;
import com.hunzhizi.service.CommentService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-08 13:16
 * @description:
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Result createComment(Comment comment) {
        boolean flag = commentService.createComment(comment);
        return flag ?
                new Result(Code.COMMENT_SAVE_OK) :
                new Result(Code.COMMENT_SAVE_ERR);

    }

    @PutMapping
    public Result updateComment(Comment comment) {
        boolean flag = commentService.updateComment(comment);
        return flag ?
                new Result(Code.COMMENT_UPDATE_OK) :
                new Result(Code.COMMENT_UPDATE_ERR);
    }

    @GetMapping("/{postId}/{pageNum}/{pageSize}")
    public PageInfo<Comment> getCommentByPostId(@PathVariable Integer postId, @PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        return commentService.getCommentByPostId(postId, pageNum, pageSize);
    }
}
