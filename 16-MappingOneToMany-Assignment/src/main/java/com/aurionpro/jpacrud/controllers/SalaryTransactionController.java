package com.aurionpro.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.SalaryTransactionDto;
import com.aurionpro.jpacrud.entities.SalaryTransaction;
import com.aurionpro.jpacrud.services.SalaryTransactionService;

@RestController
@RequestMapping("/bankapp")
public class SalaryTransactionController {
	
	@Autowired
	private SalaryTransactionService salaryTransactionService;
	
	
	@PostMapping("/addSalaryTransaction")
	public ResponseEntity<SalaryTransaction> addSalaryTransaction(@RequestBody SalaryTransactionDto salaryTransactionDto) {
		return ResponseEntity.ok(salaryTransactionService.addSalaryTransaction(salaryTransactionDto));
	}
	
	@GetMapping("/gettransactions")
	public ResponseEntity<List<SalaryTransaction>> getAllSalaryTransactions(){
		return ResponseEntity.ok(salaryTransactionService.getAllSalaryTransactions());
	}

}
