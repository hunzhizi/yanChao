package com.hunzhizi.dao;

import com.hunzhizi.domain.Post;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-02 10:05
 * @description:
 */
public interface PostDao {
    boolean createPost(Post post);

    boolean delPostByPostId(Integer postId);

    boolean updatePost(Post post);

    List<Post> getPostByUserId(Integer userId);

    List<Post> getPostByPriority();

    List<Post> getPostByLastEditTime();
}
