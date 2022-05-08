package com.hunzhizi.domain;

import java.util.List;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-04-28 09:55
 * @description:校园知乎的问题板块
 */
public class ZhiHuQuestion {
    private int priority; //热度
    private int zhiHuQuestionId;
    private String zhiHuQuestionContent;
    private int userId;
    private List<Post> answers;

}
