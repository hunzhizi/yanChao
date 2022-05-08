package com.hunzhizi.domain;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-04-27 20:45
 * @description:
 * 我的：里面存放我的帖子和我的收藏
 */
public class My {
    private int userId;
    private List<Post> myCollections;   //我的收藏
    private List<Integer> myPosts;  //我的帖子
    private List<Integer> myQuestions; //我的提问
}
