package com.aurionpro.first.repository;

import com.aurionpro.first.entity.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	private Employee[] employees;

	@Override
	public String getEmployeeDetails(long employeeId) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
            if (employee.getEmployeeid() == employeeId) {
                return "Employee Details: " + employee.toString();
            }
        }
        return "Employee with ID " + employeeId + " not found.";
    }
	}


