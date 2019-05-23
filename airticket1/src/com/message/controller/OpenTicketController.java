package com.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.message.bean.OpenTicket;
import com.message.service.OpenTicketService;

@Controller
public class OpenTicketController {

	@Autowired
	private OpenTicketService openTicketService;
	
	@RequestMapping("doopenTicket")
	public String addOpenTicket(Model model,@ModelAttribute("OpenTicket") OpenTicket openTicket) {
		
		System.out.println(openTicketService);
		
		
		return "openTicket";
		
	}
}
