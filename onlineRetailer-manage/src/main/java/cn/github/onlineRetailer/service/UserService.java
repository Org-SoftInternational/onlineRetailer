package cn.github.onlineRetailer.service;

import java.util.List;

import cn.github.onlineRetailer.entity.User;

public interface UserService {
	
	User getUser(String name,String password);
	
	String findSet();
	
	void addUser(User user);
	
	void deleteUserById(Integer userId);
	
	void deleteUserBySelected(Integer[] userId);
	
	List<User> userList();	
	
	User getUserById(Integer userId);
	
	void updateUserById(User user);
}
