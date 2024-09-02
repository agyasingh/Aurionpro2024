package com.aurionpro.dbconnect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.dbconnect.entities.Payment;
import com.aurionpro.dbconnect.services.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentservice;
	
	@GetMapping("/payments")
	public ResponseEntity<List<Payment>> getListOfPayments(){
		return ResponseEntity.ok(paymentservice.getListOfPayments());
	}
	
	@PostMapping("/payments")
	public String addPayment(@RequestBody Payment payment)
	{
		paymentservice.addPayment(payment);
		return "payment added successfully";
	}
	
	@PostMapping("payments/deletepayment")
	public String deletePayment(@RequestParam long paymentId) {
		paymentservice.deletePayment(paymentId);
		return "payment deleted successfully";
	}
	
	

}
