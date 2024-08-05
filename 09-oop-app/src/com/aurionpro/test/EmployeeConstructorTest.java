package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.EmployeeConstructor;

public class EmployeeConstructorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        EmployeeConstructor[] employees = new EmployeeConstructor[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee code");
            long employeeCode = scanner.nextLong();
            
            // Consume the remaining newline character
            scanner.nextLine();
            
            System.out.println("Enter name");
            String name = scanner.nextLine();
            
            System.out.println("Enter age");
            int age = scanner.nextInt();
            
            System.out.println("Enter salary");
            int salary = scanner.nextInt();
            
            // Consume the remaining newline character
            scanner.nextLine();
            
            System.out.println("Enter department");
            String department = scanner.nextLine();
            
            employees[i] = new EmployeeConstructor(employeeCode, name, age, salary, department);
            System.out.println("Employee code of the employee is " + employees[i].getEmployeeCode());
            System.out.println("Name of the employee is " + employees[i].getName());
            System.out.println("Age of the employee is " + employees[i].getAge());
            System.out.println("Salary of the employee is " + employees[i].getSalary());
            System.out.println("Department of the employee is " + employees[i].getDepartment());
        }
        
        scanner.close();
       
    }
}
