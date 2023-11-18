package com.students_manager.rowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.students_manager.models.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setPrimary_student_id(rs.getInt("primary_student_id"));
		
		student.setFull_name(rs.getString("full_name"));
		
		student.setAge(rs.getInt("age"));
		
		student.setGender_id(rs.getInt("gender_id"));
		
		student.setCountry_id(rs.getInt("country_id"));
		
		student.setGender(rs.getString("gender"));
		
		student.setCountry(rs.getString("country"));

		return student;
		
	}

}
