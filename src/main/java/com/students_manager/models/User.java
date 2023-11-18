package com.students_manager.models;

public class User {
	
	private int user_id;
	
	private String full_name;
	
	private String username;
	
	private String password;

	public int getUser_id() {
		
		return user_id;
		
	}

	public void setUser_id(int user_id) {
		
		this.user_id = user_id;
		
	}

	public String getFull_name() {
		
		return full_name;
		
	}

	public void setFull_name(String full_name) {
		
		this.full_name = full_name;
		
	}

	public String getUsername() {
		
		return username;
		
	}

	public void setUsername(String username) {
		
		this.username = username;
		
	}

	public String getPassword() {
		
		return password;
		
	}

	public void setPassword(String password) {
		
		this.password = password;
		
	}

	@Override
	public String toString() {
		
		return String.format(
				
			"User [user_id = %s, full_name = %s, username = %s, password = %s]",
				
			user_id, full_name, username,password
			
		);
		
	}

}
