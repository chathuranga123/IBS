package com.ibs.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibs.bean.user.User;
import com.ibs.dao.login.UserDao;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	 @Autowired
	    private UserDao userDAO;
	 
	    @Transactional
	    public void addUser(User user) {
	    	userDAO.addUser(user);
	    }
}
