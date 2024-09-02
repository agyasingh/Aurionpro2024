package com.aurionpro.project.services;

import org.springframework.stereotype.Service;

import com.aurionpro.project.dto.CreditDto;
import com.aurionpro.project.dto.TransactionDto;
import com.aurionpro.project.dto.TransferDto;
import com.aurionpro.project.dto.WithdrawDto;
import com.aurionpro.project.entities.Transaction;

@Service
public interface TransactionService {
	TransactionDto transfer(TransferDto transferDto);
	TransactionDto withdraw(WithdrawDto withdrawDto);
	TransactionDto credit(CreditDto creditDto);
	
}
