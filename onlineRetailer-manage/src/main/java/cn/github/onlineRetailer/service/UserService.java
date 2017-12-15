package cn.github.onlineRetailer.service;

import cn.github.onlineRetailer.entity.User;

public interface UserService {

	void AddUser(User user);
	
	User getUser(String name,String password);
	
	String findSet();
}
