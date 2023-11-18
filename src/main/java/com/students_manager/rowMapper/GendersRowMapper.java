package com.students_manager.rowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.students_manager.models.Gender;

public class GendersRowMapper implements RowMapper<Gender> {

	@Override
	public Gender mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Gender gender = new Gender();
		
		gender.setPrimary_gender_id(rs.getInt("primary_gender_id"));
		
		gender.setGender(rs.getString("gender"));

		return gender;
		
	}

}
