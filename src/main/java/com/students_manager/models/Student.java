package com.students_manager.models;

public class Student {
	
	private int primary_student_id;
	
	private String full_name;
	
	private int age;
	
	private int gender_id;
	
	private int country_id;
	
	private String gender;
	
	private String country;

	public int getPrimary_student_id() {
		
		return primary_student_id;
		
	}

	public void setPrimary_student_id(int primary_student_id) {
		
		this.primary_student_id = primary_student_id;
		
	}

	public String getFull_name() {
		
		return full_name;
		
	}

	public void setFull_name(String full_name) {
		
		this.full_name = full_name;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
	}

	public int getGender_id() {
		
		return gender_id;
		
	}

	public void setGender_id(int gender_id) {
		
		this.gender_id = gender_id;
		
	}
	
	public String getGender() {
		
		return gender;
		
	}

	public void setGender(String gender) {
		
		this.gender = gender;
		
	}

	public int getCountry_id() {
		
		return country_id;
		
	}

	public void setCountry_id(int country_id) {
		
		this.country_id = country_id;
		
	}
	
	public String getCountry() {
		
		return country;
		
	}

	public void setCountry(String country) {
		
		this.country = country;
		
	}

	@Override
	public String toString() {
		
		return String.format(
				
			"Student [id=%s, full_name=%s, age=%s, gender_id=%s, country_id=%s]",
			
			primary_student_id, full_name, age, gender_id, country_id
			
		);
		
	}

}
