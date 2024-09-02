package com.aurionpro.jpacrud.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class StudentErrorResponse {
	
	private int statusCode;
	private String errorMessage;
	private long timestamp;
	
	//we will show this to the client 
	
	
	

}
