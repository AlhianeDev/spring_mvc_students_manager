package com.students_manager.rowMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.students_manager.models.Country;

public class CountriesRowMapper implements RowMapper<Country> {

	@Override
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Country country = new Country();
		
		country.setPrimary_country_id(rs.getInt("primary_country_id"));
		
		country.setCountry(rs.getString("country"));

		return country;
		
	}

}
