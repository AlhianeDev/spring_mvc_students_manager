package com.students_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.students_manager.security.UserStatus;

@Controller
public class StaticController {
	
	@Autowired
	UserStatus userStatus;
	
	@RequestMapping(value= "/contact", method = RequestMethod.GET)
	public String contact_page(ModelMap modelMap) {
		
		modelMap.put(
				
			"user_status",
			
			userStatus.is_user_loggedin() ? "loggedin" : "loggedout"
				
		);
		
		return "static_pages/contact";
		
	}
	
	@RequestMapping(value= "/about", method = RequestMethod.GET)
	public String about_page(ModelMap modelMap) {
		
		modelMap.put(
				
			"user_status",
			
			userStatus.is_user_loggedin() ? "loggedin" : "loggedout"
					
		);
		
		return "static_pages/about";
		
	}
	
	@RequestMapping(value= "/terms_of_service", method = RequestMethod.GET)
	public String terms_of_service_page(ModelMap modelMap) {
		
		modelMap.put(
				
			"user_status",
			
			userStatus.is_user_loggedin() ? "loggedin" : "loggedout"
				
		);
		
		return "static_pages/terms_of_service";
		
	}
	
	@RequestMapping(value= "/privacy_policy", method = RequestMethod.GET)
	public String privacy_policy_page(ModelMap modelMap) {
		
		modelMap.put(
				
			"user_status",
			
			userStatus.is_user_loggedin() ? "loggedin" : "loggedout"
				
		);
		
		return "static_pages/privacy_policy";
		
	}
	
	@RequestMapping(value= "/how_to_use", method = RequestMethod.GET)
	public String how_to_use_page(ModelMap modelMap) {
		
		modelMap.put(
				
			"user_status",
			
			userStatus.is_user_loggedin() ? "loggedin" : "loggedout"
				
		);
		
		return "static_pages/how_to_use";
		
	}
	
	@RequestMapping(value = "/{.+}", method = RequestMethod.GET)
	public String handlePageNotFoundException() {
		
		return "errors/not_found";
		
	}

}
