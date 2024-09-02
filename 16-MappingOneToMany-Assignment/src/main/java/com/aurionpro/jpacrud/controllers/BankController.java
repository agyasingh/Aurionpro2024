package com.aurionpro.jpacrud.controllers;

import java.util.List;

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

import com.aurionpro.jpacrud.dto.BankDto;
import com.aurionpro.jpacrud.entities.Bank;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.services.BankService;

@RestController
@RequestMapping("/bankapp")
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	@GetMapping("/banks")
	public ResponseEntity<List<Bank>> getAllBanks(){
		return ResponseEntity.ok(bankservice.getAllBanks());
	}
	
	@PostMapping("/banks")
	public ResponseEntity<Bank> addBank(@RequestBody BankDto bankDto) {
	    Bank bank = bankservice.addBank(bankDto);
	    return ResponseEntity.ok(bank);
	}

	@DeleteMapping("/bank/{bankId}")
	public String deleteBank(@PathVariable long bankId) {
		bankservice.deleteBank(bankId);
		return "bank deleted successfully";
	}
	
	@PostMapping("/banks/addsalaryaccount")
	public ResponseEntity<Bank> allocateSalaryAccount(@RequestParam long bankId, @RequestBody List<SalaryAccount> salaryAccounts){
		return ResponseEntity.ok(bankservice.allocateSalaryAccount(bankId, salaryAccounts));
				
	}


}
