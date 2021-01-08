package com.practice.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo") 
	public String letsWelcome(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		model.addAttribute("message", "WELCOME " + name + "!");
		
		return "helloworld";
	}
	
	@RequestMapping("/processForm3") 
	public String letsSayHey(
			@RequestParam("studentName") String name,
			Model model) {
		
		name = name.toUpperCase();
		
		model.addAttribute("message", "Hey My Friend, " + name + "!");
		
		return "helloworld";
	}
}
