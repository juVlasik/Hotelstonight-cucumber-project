package com.hoteltonight.stepDefs;

import java.util.Map;

import com.hoteltonight.pojos.User;

import io.cucumber.java.DataTableType;

public class CustomTypeTransformer {

	
	@DataTableType
	public User userEntry ( Map<String, String> row) {
		
			
		return new User(row.get("hotelName"), 
						row.get("firstName"), 
						row.get("lastName"),
						row.get("phoneNo"),
						row.get("city"));
	}
	
	
	
}
