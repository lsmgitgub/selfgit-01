package com.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.bean.OpenTicket;
import com.message.repository.OpenTicketDao;
import com.message.service.OpenTicketService;
@Service
public class OpenTicketServiceImpl implements OpenTicketService{

	@Autowired
	private OpenTicketDao openTicketDao;
	
	public void addOpenTicket(OpenTicket openTicket) {
		// TODO Auto-generated method stub
		openTicketDao.addOpenTicket(openTicketDao);
	}

}
