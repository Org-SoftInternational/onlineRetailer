package cn.github.onlineRetailer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.github.onlineRetailer.dao.UserDao;
import cn.github.onlineRetailer.entity.User;

/**
 * @Description
 * @author disanmeng
 * @date 2017年11月15日 上午11:52:11
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml" })
public class UserDaoTest {

    @Autowired
    public UserDao userDao;

    @Test
    public void insertUserTest() {
        long id = (long) (Math.random() * 1000000l);
        User user = new User(Long.toString(id), "yangyu", "123", "1213536402@qq.com", "18351451741", "昆明");
        userDao.insertUser(user);
    }

}
