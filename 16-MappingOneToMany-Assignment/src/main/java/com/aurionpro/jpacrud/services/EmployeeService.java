package com.aurionpro.jpacrud.services;

import java.util.List;

import com.aurionpro.jpacrud.dto.EmployeeDto;
import com.aurionpro.jpacrud.entities.Client;
import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.entities.SalaryAccount;

public interface EmployeeService {
	
	Employee addEmployee(EmployeeDto employeeDto);
	
    List<Employee> getAllEmployees();
	
	Employee findEmployeeById(int employeeId);

	Employee allocateSalaryAccount(int employeeId, long accountNumber);
	

}
