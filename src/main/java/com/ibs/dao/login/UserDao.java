package com.ibs.dao.login;

import com.ibs.bean.user.User;

public interface UserDao {
	
	public void addUser(User user);
	public User getUser();
}
