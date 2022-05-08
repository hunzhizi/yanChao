package com.hunzhizi.controller.results;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-04-29 19:55
 * @description: 返回值编码
 */
public class Code {
    //操作结果编码
    //user相关
    public static final Integer USER_SAVE_OK = 20011;
    public static final Integer USER_UPDATE_OK = 20021;
    public static final Integer USER_GET_OK = 20041;
    public static final Integer PROFILE_GET_OK = 20051;



    public static final Integer USER_SAVE_ERR = 20010;
    public static final Integer USER_UPDATE_ERR = 20020;
    public static final Integer USER_GET_ERR = 20040;
    public static final Integer PROFILE_GET_ERR = 20050;

    //post 相关
    public static final Integer POST_SAVE_OK = 20111;
    public static final Integer POST_UPDATE_OK = 20121;
    public static final Integer POST_DEL_OK = 20131;
    public static final Integer POST_GET_OK = 20141;
//    public static final Integer PROFILE_GET_OK = 20051;

    public static final Integer POST_SAVE_ERR = 20110;
    public static final Integer POST_UPDATE_ERR = 20120;
    public static final Integer POST_DEL_ERR = 20130;
    public static final Integer POST_GET_ERR = 20140;
//    public static final Integer PROFILE_GET_ERR = 20050;

    //comment 相关
    public static final Integer COMMENT_SAVE_OK = 20211;
    public static final Integer COMMENT_UPDATE_OK = 20221;
    public static final Integer COMMENT_GET_OK = 20241;

    public static final Integer COMMENT_SAVE_ERR = 20210;
    public static final Integer COMMENT_UPDATE_ERR = 20220;
    public static final Integer COMMENT_GET_ERR = 20240;

    //activity 相关
    public static final Integer ACTIVITY_SAVE_OK = 20311;
    public static final Integer ACTIVITY_UPDATE_OK = 20321;
    public static final Integer ACTIVITY_GET_OK = 20341;

    public static final Integer ACTIVITY_SAVE_ERR = 20310;
    public static final Integer ACTIVITY_UPDATE_ERR = 20320;
    public static final Integer ACTIVITY_GET_ERR = 20340;

    //activityCommit 相关
    public static final Integer ACTIVITY_COMMIT_SAVE_OK = 20411;
    public static final Integer ACTIVITY_COMMIT_DEL_OK = 20431;
    public static final Integer ACTIVITY_COMMIT_GET_OK = 20441;

    public static final Integer ACTIVITY_COMMIT_SAVE_ERR = 20410;
    public static final Integer ACTIVITY_COMMIT_DEL_ERR = 20430;
    public static final Integer ACTIVITY_COMMIT_GET_ERR = 20440;

    //系统错误编码
    public static final Integer PASS_VALUE_ERR = 30001; //传值错误，例如：userId 为null

    //操作权限编码

    //校验结果编码
}
