package com.students_manager.security;

import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Service;

@Service
public class UserStatus {

	public boolean is_user_loggedin() {
		
		Object principal = SecurityContextHolder
				
				.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) return true;
		
		return false;
		
	}
	
}
