package com.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.bean.ProjectMessage;
import com.message.repository.ProjectMessageDao;
import com.message.service.ProjectMessageService;

@Service
public class ProjectMessageServiceImpl implements ProjectMessageService{

	@Autowired
	private ProjectMessageDao projectmessageDao;
	
	
	public void addDate(ProjectMessage projectmessage) {
		// TODO Auto-generated method stub
		projectmessageDao.addDate(projectmessage);
	}

}
