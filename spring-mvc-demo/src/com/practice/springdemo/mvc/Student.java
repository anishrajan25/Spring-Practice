package com.practice.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryList;
	
	
	public Student() {
		countryList = new LinkedHashMap<>();
		
		countryList.put("BR", "Brazil");
		countryList.put("DE", "Germany");
		countryList.put("FR", "France");
		countryList.put("US", "United States of America");
		countryList.put("IN", "India");
		
	}
	
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
