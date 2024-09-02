package com.aurionpro.project.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;

import com.aurionpro.project.entities.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

	
	    private String accountNumber;

	    @NotNull(message = "Account type is mandatory")
	    private AccountType accountType;

	    @NotNull(message = "Balance is mandatory")
	    @Positive(message = "Balance must be a positive number")
	    private Double balance;


	    private LocalDate createdAt;
	    
}
