package com.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.bean.UserInfo;
import com.message.repository.UserDao;
import com.message.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	public UserInfo getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(userName);
	}

}
