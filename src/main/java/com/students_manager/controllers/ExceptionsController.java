package com.students_manager.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionsController {

	@RequestMapping(value = "/access_denied", method = RequestMethod.GET)
	public String access_denied_page() {
		
		return "/errors/access_denied";
		
	}
	
}
