package com.hunzhizi.dao;

import com.hunzhizi.BaseTest;
import com.hunzhizi.domain.ActivityCommit;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 魂之子
 * @program: yanChao
 * @create: 2022-05-08 18:46
 * @description:
 */
public class ActivityCommitDaoTest extends BaseTest {
    @Autowired
    private ActivityCommitDao activityCommitDao;

    @Test
    public void createCommit() {
        ActivityCommit activityCommit = new ActivityCommit();
        activityCommit.setUserId(1);
        activityCommit.setActivityId(1);
        activityCommit.setStuName("魂之子");
        activityCommit.setClazz(4);
        activityCommit.setPhoneNum("13180961888");
        activityCommit.setQq("290249675");
        activityCommit.setStuId("201911040113");
        activityCommitDao.createCommit(activityCommit);
    }

    @Test
    public void deleteCommitByUserIdNActivityId() {
        activityCommitDao.deleteCommitByUserIdNActivityId(2, 3);
    }

    @Test
    public void getCommitByUserId() {

    }
}
