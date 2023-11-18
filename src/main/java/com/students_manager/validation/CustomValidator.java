package com.students_manager.validation;

import org.springframework.stereotype.Service;

@Service
public class CustomValidator {
	
	public boolean check_username(String username) {
		
		return username.matches("^[0-9A-Za-z]{6,16}$");
		
	}
	
	public boolean check_password(String password) {
		
		return password.matches(
				
			"^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*]).{8,}$"
				
		);
		
	}
	
	public boolean check_full_name(String full_name) {
		
		return full_name.length() >= 5 && full_name.contains(" ");
		
	}
	
	public boolean check_age(int age) {
		
		return age >= 8 && age <= 100;
		
	}

}
