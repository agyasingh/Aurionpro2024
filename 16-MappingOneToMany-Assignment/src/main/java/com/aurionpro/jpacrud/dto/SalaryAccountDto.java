package com.aurionpro.jpacrud.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryAccountDto {
	
	private long accountNumber;
	
	private String accountHolderName;

}
