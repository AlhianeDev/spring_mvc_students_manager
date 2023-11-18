package com.students_manager.dao;

import java.util.List;

import javax.sql.DataSource;

import com.students_manager.models.Country;

import com.students_manager.models.Gender;

import com.students_manager.models.Student;

public interface StudentDao {
	
	public void create_student(Student student);
	
	public Student get_student_by_id(int id);
	
	public List<Student> read_students();
	
	public void update_student_by_id(Student student);
	
	public void delete_student_by_id(int id);
	
	public List<Gender> read_genders();
	
	public List<Country> read_countries();
	
	public void setDataSource(DataSource dataSource);

}
