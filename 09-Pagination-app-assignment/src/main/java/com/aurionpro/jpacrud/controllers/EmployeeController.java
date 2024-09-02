package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employees")
	public Page<Employee> getAllEmployees(@RequestParam (required=false) String firstName, @RequestParam(defaultValue = "0") int pageNumber,@RequestParam (defaultValue = "1") int pageSize){
		if(firstName!=null) {
			return employeeservice.findByfirstName(firstName, pageNumber, pageSize);
		}
		return employeeservice.getAllEmployees(pageNumber, pageSize);
		
	}
	
	
	
	


}
