package com.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.bean.ReturnMoney;
import com.message.repository.ReturnMoneyDao;
import com.message.service.ReturnMoneyService;

@Service
public class ReturnMoneyServiceImpl implements ReturnMoneyService{
	
	@Autowired
	private ReturnMoneyDao returnMoneyDao;
	
	public void addReturnMoney(ReturnMoney returnMoney) {
		// TODO Auto-generated method stub
		returnMoneyDao.addReturnMoney(returnMoneyDao);
	}

}
