package com.message.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.message.bean.UserInfo;
import com.message.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private UserInfo userInfo;
	
	@RequestMapping(value="/toEditUser",method=RequestMethod.GET)
	public String toEdit(){
		System.out.println("toEditUser...");
		return "toEditUser";
	}
	
	@RequestMapping("toUserCenter")
	public String toUserCenter(Model model,HttpSession session){
		UserInfo tempUser = (UserInfo)session.getAttribute("loginUser");
		
		userInfo = userService.getUserByUserName(tempUser.getUserName());
		session.setAttribute("loginUser", userInfo);
		
		return "userCenter";
	}

}
