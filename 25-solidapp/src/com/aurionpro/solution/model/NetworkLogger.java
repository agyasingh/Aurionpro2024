package com.aurionpro.solution.model;

public class NetworkLogger implements ILogger {
	private String err;

public NetworkLogger(String err) {
		super();
		this.err = err;
	}

public void printerror() {
	// TODO Auto-generated method stub
	System.out.println("Logged to database" +  err);
}
}