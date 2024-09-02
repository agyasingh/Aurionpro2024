package com.aurionpro.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.SalaryAccountDto;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.services.SalaryAccountService;

@RestController
@RequestMapping("/bankapp")
public class SalaryAccountController {
	
	@Autowired
	private SalaryAccountService salaryaccountservice;
	
	@GetMapping("/salaryaccounts")
	public ResponseEntity<List<SalaryAccount>> getSalaryAccounts(){
		return ResponseEntity.ok(salaryaccountservice.getAllSalaryAccounts());
	}
	
	@PostMapping("/salaryaccounts")
	public ResponseEntity<SalaryAccount> addSalaryAccount(@RequestBody SalaryAccountDto salaryaccountDto){
		return ResponseEntity.ok(salaryaccountservice.addsalaryAccount(salaryaccountDto));
	}

}
