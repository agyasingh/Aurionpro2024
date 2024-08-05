package com.aurionpro.model;

public class Student {
	
	
	public Student(IStudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	//student service will be giving me marks and ubjects who is not available-it is an interface
	private IStudentService studentservice;
	public double calculatePercentage() {
		return studentservice.getMarks()/studentservice.getNumberOfSubjects();
	}

}
