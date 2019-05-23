package com.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.message.bean.ReturnMoney;
import com.message.service.ReturnMoneyService;

@Controller
public class ReturnMoneyController {

	@Autowired
	private ReturnMoneyService returnMoneyService;
	
	@RequestMapping("doReturnMoney")
	public String addReturnMoney(Model model,@ModelAttribute("ReturnMoney") ReturnMoney returnMoney) {
		

		System.out.println(returnMoneyService);
		
		return "returnMoney";
		
	}

}
