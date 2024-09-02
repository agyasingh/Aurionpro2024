package com.aurionpro.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.SalaryDto;
import com.aurionpro.jpacrud.entities.Salary;
import com.aurionpro.jpacrud.services.SalaryService;

@RestController
@RequestMapping("/bankapp")
public class SalaryController {
	
	@Autowired
	private SalaryService salaryservice;
	
	@GetMapping("/salary")
	public ResponseEntity<List<Salary>> getAllSalary(){
		return ResponseEntity.ok(salaryservice.getAllSalary());
	}
	
	@PostMapping("/salary")
	public ResponseEntity<Salary> addSalary(@RequestBody SalaryDto salaryDto){
		return ResponseEntity.ok(salaryservice.addSalary(salaryDto));
				
	}

}
