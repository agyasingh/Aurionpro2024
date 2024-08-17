package com.aurionpro.entity;

public class Student {
	private int roll_number;
	
	private String name;
	
	private double percentage;
	
	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Student(int roll_number, String name, double percentage) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.percentage = percentage;
	}
	
	

}
