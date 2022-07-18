package com.hunzhizi.dao;

import com.hunzhizi.BaseTest;
import com.hunzhizi.domain.Post;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-02 10:58
 * @description:
 */
public class PostDaoTest extends BaseTest {
    @Autowired
    PostDao postDao;

    @Test
    public void createPost() {
        Post post = new Post();
        post.setContent("欢迎来到燕巢");
        post.setUserId(1);
        postDao.createPost(post);
    }

    @Test
    public void delPostByPostId() {

    }

    @Test
    public void updatePost() {

    }

    @Test
    public void getPostByUserId() {

        List<Post> posts = postDao.getPostByUserId(1);
        for (Post post : posts) {
            System.out.println(post.getContent());
        }

    }

    @Test
    public void getPostByPriority() {

    }

    @Test
    public void getPostByLastEditTime() {

    }


}
