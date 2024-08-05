package com.aurionpro.model;

public class Employee {
	private int accountnumber;
	private int employeecode;
	private String name;
	private int age;
	private int salary;
	private String department;
	
	public void setAccountNumber(int acn) {
		this.accountnumber=acn;
	}
	public void setEmployeeCode(int c) {
		this.employeecode=c;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public void setSalary(int s) {
		this.salary=s;
	}
	
	public void setDepartment(String d) {
		this.department=d;
	}
	
	public int getAccountNumber() {
		return accountnumber;
	}
	
	public int getEmployeeCode() {
		return employeecode;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDepartment() {
		return department;
	}

}
