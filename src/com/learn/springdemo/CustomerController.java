package com.learn.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@RequestMapping("showForm")
	public String showForm(Model themodel) {
		
		themodel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	/**
	 * @param newCustomer (extracted from 'Model' using @ModelAttribute )
	 * @param errResult (object obtained after performing the Validation{using @Valid} on newCustomer )
	 * @return
	 */
	@RequestMapping("processForm")
	public String processForm( @Valid @ModelAttribute("customer") Customer newCustomer, BindingResult errResult) {
		if(errResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
	
	
	/**
	 * this method trims whitespaces in input string 
	 * @param dataBinder (every data object from incoming web request)
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		/**
		 * passing true ensures that string with only whitespaces is returned as null object
		 */
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		/**
		 * performs trimming operation on all objects of String class
		 */
		dataBinder.registerCustomEditor(String.class, trimmer);
		
		
	}
}
