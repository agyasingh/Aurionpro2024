package com.aurionpro.first.entity;

public class Employee {
	
	private long employeeid;
	private String name;
	private long salary;
	public Employee(long employeeid, String name, long salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
