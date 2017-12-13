package cn.github.onlineRetailer.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.github.onlineRetailer.dao.UserDao;
import cn.github.onlineRetailer.entity.User;
import cn.github.onlineRetailer.service.UserService;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userdao;

	@Override
	public void AddUser(User user) {
		userdao.insertUser(user);
	}

	@Override
	public User getUser(String name, String password) {
		// TODO Auto-generated method stub
		if(null !=name && null!=password){
		   return  userdao.getUser(name,password);
		}
		return null;
	}

}
