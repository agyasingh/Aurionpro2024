package com.aurionpro.model;

public class Student {
	
	private IStudentService studentservice;
	
	public Student(IStudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//student service will be giving me marks and ubjects who is not available-it is an interface
	
	public double calculatePercentage() {
		return studentservice.getMarks()/studentservice.getNumberOfSubjects();
	}

}
