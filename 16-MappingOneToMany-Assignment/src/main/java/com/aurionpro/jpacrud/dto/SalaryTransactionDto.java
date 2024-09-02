package com.aurionpro.jpacrud.dto;

import java.time.LocalDate;

import com.aurionpro.jpacrud.entities.TransactionStatus;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalaryTransactionDto {
	
	    private long transactionId;
	    
	    private LocalDate transactionDate;
	    
	    private long amount;
	 
	    private TransactionStatus transactionStatus;

}
