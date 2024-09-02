package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.service.EmployeeService;

@RestController
@RequestMapping("/employeeapp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ResponseEntity<PageResponse<Employee>> getAllEmployees(@RequestParam int pageNo,@RequestParam int pageSize){
		return ResponseEntity.ok(employeeService.getAllEmployees(pageNo, pageSize));
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "employee added successfully";
	}
	
	@PostMapping("/employees/update")
	public ResponseEntity<SalaryAccount> updateSalaryAccount(@RequestParam long employeeId, @RequestBody SalaryAccount salaryAccount) {
	    return ResponseEntity.ok(employeeService.updateSalaryAccount(employeeId, salaryAccount));
	}

	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam long employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "employee deleted successfully";
	}

}
