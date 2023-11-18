package com.students_manager.models;

public class Gender {
	
	private int primary_gender_id;
	
	private String gender;

	public int getPrimary_gender_id() {
		
		return primary_gender_id;
		
	}

	public void setPrimary_gender_id(int primary_gender_id) {
		
		this.primary_gender_id = primary_gender_id;
		
	}

	public String getGender() {
		
		return gender;
		
	}

	public void setGender(String gender) {
		
		this.gender = gender;
		
	}

	@Override
	public String toString() {
		
		return String.format(
				
			"Gender [id=%s, gender=%s]",
				
			primary_gender_id, gender
		
		);
		
	}

}
