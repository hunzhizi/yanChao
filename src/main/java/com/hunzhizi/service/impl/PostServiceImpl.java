package com.hunzhizi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunzhizi.dao.PostDao;
import com.hunzhizi.domain.Post;
import com.hunzhizi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-02 11:26
 * @description:
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    public boolean createPost(Post post){
       return postDao.createPost(post);
    }

    public boolean delPostByPostId(Integer postId){
        return postDao.delPostByPostId(postId);
    }

    public boolean updatePost(Post post){
        post.setLastEditTime(new Date());
        post.setPriority();
        //如果帖子的举报数量超过10 ，就将其delete掉
        if(post.getReportNum()!=null && post.getReportNum()>=10){
            return postDao.delPostByPostId(post.getPostId());
        }
        return postDao.updatePost(post);
    }

    public List<Post> getPostByUserId(Integer userId){
        return postDao.getPostByUserId(userId);
    }

    public PageInfo<Post> getPostByPriority(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Post> posts = postDao.getPostByPriority();
        return new PageInfo<Post>(posts);
    }

    public PageInfo<Post> getPostByLastEditTime(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Post> posts = postDao.getPostByLastEditTime();
        return new PageInfo<Post>(posts);
    }
}
