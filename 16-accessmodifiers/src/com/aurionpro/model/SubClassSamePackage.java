package com.aurionpro.model;

public class SubClassSamePackage extends ParentClass {
	
    
  
	public void display() {
        //System.out.println("Private: " + privateVar); // Not accessible
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
