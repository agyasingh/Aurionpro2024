package com.aurionpro.solution.model;

public class FileLogger implements ILogger {
 private String error;
	
	
	
	
		

	public FileLogger(String error) {
		super();
		this.error = error;
	}


	
	public void printerror(String error) {
		// TODO Auto-generated method stub
		System.out.println("Logged to database" + error);
	}
		
	

}


