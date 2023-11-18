package com.students_manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.students_manager.dao.UserDao;

import com.students_manager.models.User;

import com.students_manager.validation.CustomValidator;

@Controller
public class SignupController {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	CustomValidator cv;
	
	@RequestMapping(value= "/sign_up", method = RequestMethod.GET)
	public ModelAndView sign_up_page() {
		
		return new ModelAndView("sign_up", "sign_status", "sign_up");
		
	}
	
	@RequestMapping(value= "/sign_up", method = RequestMethod.POST)
	public ModelAndView sign_up(@ModelAttribute User user) {
		
		ModelAndView mav;
		
		if (
				
			cv.check_full_name(user.getFull_name()) &&
			
			cv.check_username(user.getUsername()) &&
		
			cv.check_password(user.getPassword())
			
		) {
		
			if (userDao.is_user_already_exists(user.getUsername()) == null) {
				
				userDao.register(user);
				
				mav = new ModelAndView("login");
				
				mav.addObject("sign_status", "sign_in");
				
			} else {
				
				mav = new ModelAndView("sign_up");
				
				mav.addObject("sign_status", "sign_up");
				
				mav.addObject("error_msg", "Username Is Already Exists!");
				
			}
		
		} else {
			
			mav = new ModelAndView("sign_up");
			
			mav.addObject("user", user);
			
			mav.addObject("sign_status", "sign_up");
			
			if (!cv.check_full_name(user.getFull_name())) {
				
				mav.addObject("full_name_error", "Invalid full name!");
				
			}
			
			if (!cv.check_username(user.getUsername())) {
				
				mav.addObject("username_error", "Invalid Username!");
				
			}
			
			if (!cv.check_password(user.getPassword())) {
				
				mav.addObject("password_error", "Weak Password!");
				
			}
			
		}
			
		return mav;
		
	}

}
