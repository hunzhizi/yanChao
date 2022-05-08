package com.hunzhizi.service;

import com.github.pagehelper.PageInfo;
import com.hunzhizi.domain.Post;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-02 11:23
 * @description:
 */
@Transactional(readOnly = true)
public interface PostService {
    @Transactional(readOnly = false)

    boolean createPost(Post post);

    @Transactional(readOnly = false)
    boolean delPostByPostId(Integer postId);

    @Transactional(readOnly = false)
    boolean updatePost(Post post);

    List<Post> getPostByUserId(Integer userId);

    public PageInfo<Post> getPostByPriority(int pageNum,int pageSize);

    public PageInfo<Post> getPostByLastEditTime(int pageNum,int pageSize);
}
