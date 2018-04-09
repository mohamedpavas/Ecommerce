package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class HomeController {
	public HomeController()
	{
		System.out.println("HomeController bean is created");
	}
	@RequestMapping(value="/home")
	public String getHomePage(){
		return "home";
	}
	

}
