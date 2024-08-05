package com.aurionpro.model;

public class Student {
	private int rollnumber;
	private String name;
	int age;
	double percentage;
	
	public void setRollNumber(int r) {
		this.rollnumber=r;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public void setPercentage(double p) {
		this.percentage=p;
	}
	
	public int getRollNumber() {
		return rollnumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getPercentage() {
		return percentage;
	}

}
