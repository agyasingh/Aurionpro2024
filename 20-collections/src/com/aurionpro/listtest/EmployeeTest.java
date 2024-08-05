package com.aurionpro.listtest;
import com.aurionpro.list.model.EmployeeComparator;

import java.util.*;
import com.aurionpro.list.model.*;

public class EmployeeTest {
public static void main(String[] args) {
	List<Employee> employees= new ArrayList<Employee>();
	Scanner scanner=new Scanner(System.in);
	
	employees.add(new Employee(2,"namrata",80));
	employees.add(new Employee(4,"Neha" ,75));
	employees.add(new Employee(1,"Sayali", 85));
	employees.add(new Employee(5,"aagya",90));
	System.out.println("Before sorting employee id");
	System.out.println(employees);
	
	
	Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
	
	System.out.println("After sorting employee id");
	Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
	System.out.println(employees);
}}