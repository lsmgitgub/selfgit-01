package com.message.repository;


import com.message.bean.UserInfo;


public interface UserDao {
	
	public UserInfo findUserByName(String userName);
	
	
}

