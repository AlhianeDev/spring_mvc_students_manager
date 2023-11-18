package com.students_manager.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.IncorrectResultSizeDataAccessException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.students_manager.models.User;

import com.students_manager.rowMapper.UserRowMapper;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User is_user_already_exists(String username) {
		
		User user = null;
		
		try {
			
			user = jdbcTemplate.queryForObject(
				
				"SELECT * FROM users WHERE username = ?",
				
				new Object [] { username },
				
				new UserRowMapper()
							
			);
			
		} catch (IncorrectResultSizeDataAccessException ex) {
			
			System.err.println("Error: " + ex.getMessage());
			
		}
		
		return user;
		
	}

	@Override
	public void register(User user) {
			
		jdbcTemplate.update(
				
			"INSERT INTO users (full_name, username, password, enabled) "
	
			+ "VALUES(?, ?, ?, ?)",
			
			new Object [] {
					
				user.getFull_name(),
				
				user.getUsername(),
				
				user.getPassword(),
				
				1
					
			}
				
		);
		
		jdbcTemplate.update(
				
			"INSERT INTO user_roles (username, role) VALUES(?, ?)",
			
			new Object [] { user.getUsername(), "ROLE_USER" }
					
		);
		
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		
		this.dataSource = dataSource;
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

}
