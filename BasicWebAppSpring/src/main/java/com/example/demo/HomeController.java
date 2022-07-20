package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(@RequestParam("name")String myName, HttpSession session) {
		// remember this name parameter should be the same as in the request parameter
		// if you want to change the parameter name in method from the parameter you
		// pass in the request then use RequestParam("paramName") in the method before
		// declaring name variable and vice versa
		System.out.println("In Home Method");
		System.out.println("Hi " + myName);
		session.setAttribute("name", myName);
		return "home";
	}
}
