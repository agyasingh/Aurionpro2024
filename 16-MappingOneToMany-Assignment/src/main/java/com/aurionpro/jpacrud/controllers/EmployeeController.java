package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.aurionpro.jpacrud.dto.EmployeeDto;
import com.aurionpro.jpacrud.entities.*;

import com.aurionpro.jpacrud.services.EmployeeService;

@RestController
@RequestMapping("/bankapp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
		return ResponseEntity.ok(employeeservice.addEmployee(employeeDto));
		
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return ResponseEntity.ok(employeeservice.getAllEmployees());
	}
	
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable int employeeId) {
		return ResponseEntity.ok(employeeservice.findEmployeeById(employeeId));
	}
	
	@PostMapping("/employees/allocateSalaryAccount")
	public Employee allocateSalaryAccount(@RequestParam int employeeId,@RequestParam long accountNumber) {
		return employeeservice.allocateSalaryAccount(employeeId, accountNumber);
	}

}
