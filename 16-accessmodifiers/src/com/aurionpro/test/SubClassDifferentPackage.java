package com.aurionpro.test;

import com.aurionpro.model.ParentClass;

public class SubClassDifferentPackage extends ParentClass {
    public void display() {
        // System.out.println("Private: " + privateVar); // Not accessible
        // System.out.println("Default: " + defaultVar); // Not accessible
        //System.out.println("Protected: " + protectedVar);//not accessible
        System.out.println("Public: " + publicVar);
    }
}
