package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	Employee employee1=new Employee();
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Employee code");
	int employeecode=scanner.nextInt();
	employee1.setEmployeeCode(employeecode);
	
	System.out.println("Enter name");
	String name=scanner.next();
	employee1.setName(name);
	
	System.out.println("Enter age");
	int age=scanner.nextInt();
	employee1.setAge(age);
	
	System.out.println("Enter salary");
	int salary=scanner.nextInt();
	employee1.setSalary(salary);
	
	System.out.println("Enter department");
	String department=scanner.next();
	employee1.setDepartment(department);
	
	System.out.println("Employee code of the employee is" + " " +employee1.getEmployeeCode());
	System.out.println("Name of the employee is" + " " +employee1.getName());
	System.out.println("age of the empoyee is" + " " +employee1.getAge());
	System.out.println("Salary of the employee is" + " " +employee1.getSalary());
	System.out.println("Department of the employee is" + " " +employee1.getDepartment());
}
}
