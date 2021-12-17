package com.learn.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spring-app")
public class FormController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "helloWorldForm";
	}
	
	@RequestMapping("showFormData")
	public String submitForm(HttpServletRequest request, Model model) {
		
		String input = request.getParameter("studentName");
		
		input = input.toUpperCase();
		
		String msg = "Hi...." + input;
		
		model.addAttribute("message", msg);
		
		return "showFormData";
	}

}
