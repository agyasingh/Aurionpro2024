package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {
public static void main(String[] args) {
	Student student1=new Student();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter rollnumber");
	int rollnumber=scanner.nextInt();
	student1.setRollNumber(rollnumber);
	
	System.out.println("Enter name");
	String name=scanner.next();
	student1.setName(name);
	
	System.out.println("Enter age");
	int age=scanner.nextInt();
	student1.setAge(age);
	
	System.out.println("Enter percentage");
	double percentage=scanner.nextDouble();
	
	System.out.println("Roll number is" + " " +student1.getRollNumber());
	System.out.println("Name is" + " " +student1.getName());
	System.out.println("age is" + " " +student1.getAge());
	System.out.println("percentage is" + " " +student1.getPercentage());
	
}
}
