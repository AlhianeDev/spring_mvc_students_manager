package com.students_manager.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configureClobalSecurity(AuthenticationManagerBuilder auth) 
			
			throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource)
		
		.usersByUsernameQuery(
		
			"SELECT username, password, enabled FROM users WHERE " +
					
			"username = ?"
				
		).authoritiesByUsernameQuery(
			
			"SELECT username, role FROM user_roles WHERE " +
					
			"username = ?"
				
		);
		
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) 
			
			throws Exception {
		
		httpSecurity.authorizeRequests()
		
		.antMatchers("/login", "/sign_up").permitAll()
		
		.antMatchers("/add_student").access("hasRole('ADMIN')")
		
		.antMatchers("/update_student").access("hasRole('ADMIN')")
		
		.antMatchers("/delete_student").access("hasRole('ADMIN')")
		
		.antMatchers("/", "/*student*/**").access("hasRole('USER')")
		
		.and().exceptionHandling().accessDeniedPage("/access_denied")
		
		.and().formLogin().loginPage("/login");
		
	}

}
