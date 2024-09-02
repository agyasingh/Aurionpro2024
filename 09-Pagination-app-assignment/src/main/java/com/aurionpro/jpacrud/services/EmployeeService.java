package com.aurionpro.jpacrud.services;

import org.springframework.data.domain.Page;

import com.aurionpro.jpacrud.entities.Employee;

public interface EmployeeService {
	
	Page<Employee> findByfirstName(String firstName,int pageNumber,int pageSize);
    Page<Employee> getAllEmployees(int pageNumber,int pageSize);
}
