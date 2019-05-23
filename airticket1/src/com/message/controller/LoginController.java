package com.message.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.message.bean.UserInfo;
import com.message.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	private UserInfo userInfo;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		System.out.println("to login");
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logOut(HttpSession session){
		
		session.invalidate();
		System.out.println("logout >>>>>>>>>>>>>>>>");
		return "login";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String doLogin(HttpServletRequest request,HttpSession session) {
		System.out.println("doLogin..oooo.");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("userName:"+userName);
		System.out.println("password:"+password);
		
		userInfo = userService.getUserByUserName(userName);
		
		if(userName.equals(userInfo.getUserName() 
				)&& password.equals(userInfo.getPassword())){
			session.setAttribute("loginUser", userInfo);
			if(userInfo.getRole() == 0){			
				return "userCenter";
			}
			else{
				return "adminManager";
			}
		}else{
			return "login";
		}
		
	
	}
	
	

}
