package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		//remember this name parameter should be the same as in the request parameter 
		System.out.println("In Home Method");
		System.out.println("Hi " + name);
		session.setAttribute("name", name);
		return "home";
	}
}
