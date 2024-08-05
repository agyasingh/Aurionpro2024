package com.aurionpro.model;

public class EmployeeConstructor {
	
	private long employeeCode;
	private String name;
	private int age;
	private int salary;
	private String department;
	
	public EmployeeConstructor(long employeeCode,String name,int age,int salary,String department) {
		
		this.employeeCode=employeeCode;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	
	public void setEmployeeCode(long employeeCode) {
		this.employeeCode=employeeCode;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	
	public long getEmployeeCode() {
		return this.employeeCode;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getDepartment() {
		return this.department;
	}

}
