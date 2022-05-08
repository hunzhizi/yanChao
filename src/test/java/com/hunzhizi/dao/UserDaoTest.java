package com.hunzhizi.dao;

import com.hunzhizi.BaseTest;
import com.hunzhizi.domain.User;
import com.hunzhizi.enums.UserType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-04-30 00:00
 * @description:
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    UserDao userDao;
    @Test
    public void testSave(){
        User user = new User();
        user.setNickname("hunzhizi");
        user.setGender(1);
        user.setUserType(UserType.VISITOR);
        user.setReportNum(0);
        user.setForbidden(false);
        user.setRecognized(true);
        user.setAnonymous(true);
        user.setOfficialName("周少");
        user.setBio("周少nb");
        user.setCreateTime(new Date());
        user.setLastEditTime(new Date());
        user.setProfileAddr("test");
        userDao.save(user);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setUserId(1);
        user.setBio("周少真nb，年薪250");
        userDao.update(user);
    }
    @Test
    public void testGet(){
        User user = userDao.get(1);
        System.out.println(user.getLastEditTime());
        System.out.println(user.getCreateTime());

    }

    @Test
    public void test(){
        File file = new File("E:/img/yanChao/temp1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
