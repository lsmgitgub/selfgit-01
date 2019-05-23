package com.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.message.bean.ProjectMessage;
import com.message.service.ProjectMessageService;

@Controller
public class ProjectMessageController {

	@Autowired
	private ProjectMessageService projectMessageService;
//	
//	@RequestMapping("toaddproject")
//	public String toaddDate() {
//		System.out.println("to  add  date ......");
//		return "projectMessage";
//	}
	@RequestMapping("toaddproject")
	public String doaddDate(Model model,@ModelAttribute("ProjectMessage") ProjectMessage projectmessage) {
		
		System.out.println(projectMessageService);
		return "projectMessage";
		
	}
}
