package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.entities.Salary;
import com.aurionpro.jpacrud.service.SalaryService;

@RestController
public class SalaryController {
	
	@Autowired
	private SalaryService salaryservice;
	
	
	@PostMapping("/salary")
	public String addSalary(Salary salary) {
		salaryservice.addSalary(salary);
		return "salary added successfully";
	}
	
	@DeleteMapping("/salary")
	public String deleteEmployee(long salaryId) {
		salaryservice.deleteSalary(salaryId);
		return "employee deleted successfully";
	}	

}
