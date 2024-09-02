package com.aurionpro.first.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.first.entity.Employee;

@Service
public class EmployeeServiceImpl {
	private List<Employee> employeeList = new ArrayList<>();

    public Employee getEmployeeById(long employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeid() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList);
    }
}
