package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name")String myName) {
		// remember this name parameter should be the same as in the request parameter
		// if you want to change the parameter name in method from the parameter you
		// pass in the request then use RequestParam("paramName") in the method before
		// declaring name variable and vice versa
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}
}
