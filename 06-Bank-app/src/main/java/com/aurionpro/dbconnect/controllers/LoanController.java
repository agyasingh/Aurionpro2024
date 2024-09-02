package com.aurionpro.dbconnect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aurionpro.dbconnect.entities.Loan;
import com.aurionpro.dbconnect.services.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@GetMapping("/loans")
	public ResponseEntity<List<Loan>> getListOfLoans(){
		return ResponseEntity.ok(loanService.getListOfLoans());
	}
	
	@PostMapping("/loans")
	public String addLoan(@RequestBody Loan loan) {
		loanService.addLoan(loan);
		return "loan added successfully";
	}
	
	@PostMapping("loans/deleteloan")
	public String deleteLoan(@RequestParam int loanId) {
		loanService.deleteLoan(loanId);
		return "Loan deleted successfully";
	}

}
