package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {
public static void main(String[] args) {
	Voter voter=null;
	try {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter voter id");
	int voterId=scanner.nextInt();
	System.out.println("Enter first name");
	String firstName=scanner.next();
	System.out.println("Enter last name");
	String lastName=scanner.next();
	System.out.println("Enter age");
	int age=scanner.nextInt();
	voter=new Voter(voterId,firstName,lastName,age);
	
	}
	catch(AgeNotValidException exception) {
		System.out.println(exception.getMessage());
	}
	System.out.println(voter);
	
}
}
