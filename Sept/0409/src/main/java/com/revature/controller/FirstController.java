package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

	
	@RequestMapping("/hi")
	public String firstPage()
	{
		return "index";
	}
	@RequestMapping("/page2")
	public String page2() {
		return "page2";
	}
	
}
