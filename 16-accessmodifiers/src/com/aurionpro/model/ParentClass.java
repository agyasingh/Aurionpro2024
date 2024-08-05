package com.aurionpro.model;

public class ParentClass {
	private int privateVar=1;
	int defaultVar=2;
	 int protectedVar=3;
	public int publicVar=4;
	
	
	public void display(){
		System.out.println("Private variable " + privateVar);
		 System.out.println("Default: " + defaultVar);
	        System.out.println("Protected: " + protectedVar);
	        System.out.println("Public: " + publicVar);
		
	}

}
