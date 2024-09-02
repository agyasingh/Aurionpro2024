package com.aurionpro.project.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	
		
		private int statusCode;
		private String errorMessage;
		private long timestamp;
		
	

}
