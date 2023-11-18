package com.students_manager.rowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.students_manager.models.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			
		User user = new User();
	
		user.setUser_id(rs.getInt("user_id"));
		
		user.setFull_name(rs.getString("full_name"));
		
		user.setUsername(rs.getString("username"));
		
		user.setPassword(rs.getString("password"));
		
		return user;
	
	}

}
