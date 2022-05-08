package com.hunzhizi.dao;

import com.hunzhizi.domain.Comment;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-08 12:32
 * @description:
 */
public interface CommentDao {
    boolean createComment(Comment comment);

    boolean updateComment(Comment comment);

    List<Comment> getCommentByPostId(Integer postId);
}
