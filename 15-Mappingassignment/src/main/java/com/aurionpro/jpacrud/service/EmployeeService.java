package com.aurionpro.jpacrud.service;

import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.*;

@Service
public interface EmployeeService {
	public void addEmployee(Employee employee);
	PageResponse<Employee> getAllEmployees(int pageNo,int pageSize);
    SalaryAccount updateSalaryAccount(long employeeId,SalaryAccount salaryAccount);
	public void deleteEmployee(long employeeId);
}
