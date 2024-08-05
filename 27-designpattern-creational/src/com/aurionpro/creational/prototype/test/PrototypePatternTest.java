package com.aurionpro.creational.prototype.test;

import java.util.List;

import com.aurionpro.creational.prototype.model.Employees;

public class PrototypePatternTest {
public static void main(String[] args) throws CloneNotSupportedException {
	Employees employee=new Employees();
	employee.loadData();
	
	
	//Cloning Employees object
	Employees empsNew1=(Employees)employee.clone();
	Employees empsNew2=(Employees)employee.clone();
	
	//Modifying cloned lists
	
	List<String> list1=empsNew1.getEmployeeList();
	list1.add("John");
	
	List<String> list2=empsNew2.getEmployeeList();
	list2.remove("Pankaj");
	
	System.out.println("Employees list" + employee.getEmployeeList());
	System.out.println("Employee list after adding an element to the clone1" + list1);
	System.out.println("Employee list after removing an element from the clone2" + list2);
	}
}
