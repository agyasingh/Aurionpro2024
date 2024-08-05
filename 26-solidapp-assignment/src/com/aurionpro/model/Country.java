package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Country {
	private int countryId;
	private String countryName;
	private String countrycode;
	


	public Country(int countryId, String countryName, String countrycode) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countrycode = countrycode;
	}


	public int getCountryId() {
		return countryId;
	}
	
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
	public String getCountryName() {
		return countryName;
	}
	
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getCountrycode() {
		return countrycode;
	}


	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
    
		  
}
