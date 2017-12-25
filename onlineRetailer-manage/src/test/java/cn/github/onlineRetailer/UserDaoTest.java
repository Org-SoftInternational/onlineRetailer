package cn.github.onlineRetailer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.github.onlineRetailer.dao.UserDao;
import cn.github.onlineRetailer.entity.User;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-dao.xml" })
public class UserDaoTest {

    @Autowired
    public UserDao userDao;

	private static final Log log = LogFactory.getLog(UserDaoTest.class);
    @Test
    public void insertUserTest() {
        int id =  (int) (Math.random() * 10000);
        User user = new User((int) id, "yangyu", "123", "1213536402@qq.com", "18351451741", "昆明");
        userDao.insertUser(user);
        log.debug(user);
        log.info(user);
        log.warn(user);
        log.error(user);
    }

    @Test
    public void getUser(){
    	User user=userDao.getUser("yangyu", "123");
		log.info(user);
    }
}