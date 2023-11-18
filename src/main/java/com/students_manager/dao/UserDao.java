package com.students_manager.dao;

import javax.sql.DataSource;

import com.students_manager.models.User;

public interface UserDao {
	
	public User is_user_already_exists(String username);
	
	public void register(User user);
	
	public void setDataSource(DataSource dataSource);

}
