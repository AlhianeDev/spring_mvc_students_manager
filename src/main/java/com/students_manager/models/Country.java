package com.students_manager.models;

public class Country {
	
	private int primary_country_id;
	
	private String country;

	public int getPrimary_country_id() {
		
		return primary_country_id;
		
	}

	public void setPrimary_country_id(int primary_country_id) {
		
		this.primary_country_id = primary_country_id;
		
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
				
			"Country [id=%s, country=%s]",
				
			primary_country_id, country
			
		);
		
	}

}
