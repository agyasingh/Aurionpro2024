package com.aurionpro.first.service;

import java.util.List;

import com.aurionpro.first.entity.Employee;

public interface EmployeeService {
    Employee getEmployeeById(long employeeId);
    List<Employee> getAllEmployees();
   
}