package com.revature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/form")
public class formControl {

	@RequestMapping("/Register")
	public String Register()
	{
		return "form";
	}
	
	@RequestMapping("/processForm")
	public ModelAndView getFormRespose(HttpServletRequest request) {
		ModelAndView mav=new ModelAndView("showform");
		String  name=request.getParameter("uname");
		String message="Yo !"  +name.toUpperCase();
		mav.addObject("messageToDisplay", message);
		return mav;
	}
}
