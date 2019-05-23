package com.message.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.message.bean.Contract;
import com.message.service.ContractService;

@Controller
public class ContractController {

	@Autowired
	private ContractService contractService;

	@RequestMapping("queryContract")
	public String toQueryContract(Model model) {

		System.out.println("to query contract......");

		return "queryContract";
	}

	@RequestMapping("doQueryContract")
	public String doQueryContract(HttpServletRequest request, HttpSession session) {
		
		System.out.println("doQuertContract");
		return "userCenter";
	}

	@RequestMapping("doAllProject")
	public String doAllProject() {
		System.out.println("sssssss");
		return "allProject";

	}
}
