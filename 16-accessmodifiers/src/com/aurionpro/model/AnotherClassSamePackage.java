package com.aurionpro.model;

public class AnotherClassSamePackage {
	
	public void display() {
        ParentClass parent = new ParentClass();
        // System.out.println("Private: " + parent.privateVar); // Not accessible
        System.out.println("Default: " + parent.defaultVar);
        System.out.println("Protected: " + parent.protectedVar);
        System.out.println("Public: " + parent.publicVar);
    }
}
