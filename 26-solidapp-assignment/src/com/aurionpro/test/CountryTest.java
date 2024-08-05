package com.aurionpro.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;


	public class CountryTest {
	    public static void main(String[] args) {
	        // Create a map for regions with Integer keys and Region values
	        Map<Integer, Region> regions = new HashMap<>();
	        
	        // Add elements to the map of regions
	        regions.put(1, new Region(1, "Europe"));
	        regions.put(2, new Region(2, "Americas"));
	        regions.put(3, new Region(3, "Asia"));
	        regions.put(4, new Region(4, "Middle East and Africa"));

	        // Create a map for countries with String keys and Country values
	        Map<String, Country> countries = new HashMap<>();
	        
	        // Add elements to the map of countries
	        countries.put("IT", new Country(1, "Italy", "IT"));
	        countries.put("JP", new Country(3, "Japan", "JP"));
	        countries.put("US", new Country(2, "United States of America", "US"));
	        countries.put("CA", new Country(2, "Canada", "CA"));
	        countries.put("CN", new Country(3, "China", "CN"));
	        countries.put("IN", new Country(3, "India", "IN"));
	        countries.put("AU", new Country(3, "Australia", "AU"));
	        countries.put("ZW", new Country(4, "Zimbabwe", "ZW"));
	        countries.put("SG", new Country(3, "Singapore", "SG"));
	        countries.put("UK", new Country(1, "United Kingdom", "UK"));
	        countries.put("FR", new Country(1, "France", "FR"));
	        countries.put("DE", new Country(1, "Germany", "DE"));
	        countries.put("ZM", new Country(4, "Zambia", "ZM"));
	        countries.put("EG", new Country(4, "Egypt", "EG"));
	        countries.put("BR", new Country(2, "Brazil", "BR"));
	        countries.put("CH", new Country(1, "Switzerland", "CH"));
	        countries.put("NL", new Country(1, "Netherlands", "NL"));
	        countries.put("MX", new Country(2, "Mexico", "MX"));
	        countries.put("KW", new Country(4, "Kuwait", "KW"));
	        countries.put("IL", new Country(4, "Israel", "IL"));
	        countries.put("DK", new Country(1, "Denmark", "DK"));
	        countries.put("HK", new Country(3, "HongKong", "HK"));
	        countries.put("NG", new Country(4, "Nigeria", "NG"));
	        countries.put("AR", new Country(2, "Argentina", "AR"));
	        countries.put("BE", new Country(1, "Belgium", "BE"));
	        
	       System.out.println("get name of country from country code");
	        List<String> countryDetails =  countries.entrySet().stream().map(entry -> entry.getValue().getCountryName() + " (" + entry.getValue().getCountrycode() + ")")
	                .collect(Collectors.toList());
	        countryDetails.forEach(System.out::println);
	        
	        System.out.println("Get all countries in a region by region id");
	        List<String> countriesByRegionId= countries.entrySet().stream().map(entry->entry.getValue().getCountryName() + "(" + entry.getValue().getCountryId() + ")" )
                                                       .collect(Collectors.toList());
	        
	        countriesByRegionId.forEach(System.out::println);
	        
	        System.out.println(" Count of countries in each region");
	        // Count the number of countries in each region ID and map to region names
	        System.out.println("Count of countries in each region:");
	        //grouping and counting
	        Map<Integer, Long> countryCountsByRegionId = countries.values().stream()
	        	    .collect(Collectors.groupingBy(
	        	        Country::getCountryId,  // Group by region ID
	        	        Collectors.counting()   // Count occurrences
	        	        
	        	    ));
	        
	        countryCountsByRegionId.forEach((regionId, count) -> {
	            String regionName = regions.get(regionId).getRegionName(); 
	            System.out.println(regionName + ": " + count);
	        });


}
}
