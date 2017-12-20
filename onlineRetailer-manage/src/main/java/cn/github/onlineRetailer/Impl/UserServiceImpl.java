package cn.github.onlineRetailer.Impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.github.onlineRetailer.dao.UserDao;
import cn.github.onlineRetailer.entity.User;
import cn.github.onlineRetailer.service.UserService;
import cn.github.onlineRetailer.tools.RedisTools;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService{
	
	private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	public UserDao userDao;

	@Override
	public User getUser(String name, String password) {
		if (null != name && null != password) {
			return userDao.getUser(name, password);
		}
		return null;
	}

	@Override
	public String findSet() {
		return RedisTools.get("123");
	}
	
	@Override
	public void addUser(User user) {
		try {
			userDao.insertUser(user);
		} catch(Exception e){
			logger.info("��������ʧ�ܣ�"+e);
		}   
	}

	@Override
	public void deleteUserById(Integer userId) {
		userDao.deleteUserById(userId);
	}

	@Override
	public void deleteUserBySelected(Integer[] userId) {
		userDao.deleteUserBySelected(userId);
	}

	@Override
	public User getUserById(Integer userId) {
		return userDao.getUserById(userId);
	}

	@Override
	public void updateUserById(User user) {
		userDao.updateUserById(user);
	}

	@Override
	public List<User> userList() {
		return userDao.userList();
	}

}
