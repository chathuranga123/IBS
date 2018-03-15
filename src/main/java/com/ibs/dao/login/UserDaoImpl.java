package com.ibs.dao.login;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibs.bean.user.User;
@Repository
public class UserDaoImpl implements UserDao{
	
    @Autowired
    private SessionFactory sessionFactory;
	public void addUser(User user){
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	public User getUser(){
		return new User();
	}
	

}
