package com.students_manager.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import com.students_manager.models.Country;

import com.students_manager.models.Gender;

import com.students_manager.models.Student;

import com.students_manager.rowMapper.CountriesRowMapper;

import com.students_manager.rowMapper.GendersRowMapper;

import com.students_manager.rowMapper.StudentRowMapper;

public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		
		this.dataSource = dataSource;
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public void create_student(Student student) {
		
		jdbcTemplate.update(
			
			"INSERT INTO students (full_name, age, gender_id, country_id) " +
			
			"VALUES(?, ?, ?, ?)",
			
			new Object [] {
					
				student.getFull_name(),
				
				student.getAge(),
				
				student.getGender_id(),
				
				student.getCountry_id()
				
			}
				
		);
		
	}
	
	@Override
	public Student get_student_by_id(int primary_student_id) {

		return jdbcTemplate.queryForObject(
				
			"SELECT * FROM students " +
 
			"INNER JOIN genders ON genders.primary_gender_id = students.gender_id " +

			"INNER JOIN countries ON countries.primary_country_id = students.country_id " +

			"WHERE students.primary_student_id = ?;",
			
			new Object [] { primary_student_id },
			
			new StudentRowMapper()
				
		);
		
	}

	@Override
	public List<Student> read_students() {
		
		return jdbcTemplate.query(
				
			"SELECT * FROM students " +

			"INNER JOIN genders ON genders.primary_gender_id = students.gender_id " +

			"INNER JOIN countries ON countries.primary_country_id = students.country_id;",
			
			new StudentRowMapper()
				
		);
		
	}
	
	@Override
	public void update_student_by_id(Student student) {

		jdbcTemplate.update(
				
			"UPDATE students SET full_name = ?, age = ?, gender_id = ?, "
				
			+ " country_id = ? WHERE primary_student_id = ?",
			
			new Object [] {
					
				student.getFull_name(),
				
				student.getAge(),
				
				student.getGender_id(),
				
				student.getCountry_id(),
				
				student.getPrimary_student_id()
				
			}
					
		);
		
	}

	@Override
	public void delete_student_by_id(int primary_student_id) {
		
		jdbcTemplate.update(
				
			"DELETE FROM students WHERE primary_student_id = '" + 
	
			primary_student_id + "'"
				
		);
		
	}

	@Override
	public List<Gender> read_genders() {
		
		return jdbcTemplate.query(
				
			"SELECT * FROM genders",
			
			new GendersRowMapper()
				
		);
		
	}

	@Override
	public List<Country> read_countries() {
		
		return jdbcTemplate.query(
			
			"SELECT * FROM countries",
			
			new CountriesRowMapper()
					
		);

	}

}
