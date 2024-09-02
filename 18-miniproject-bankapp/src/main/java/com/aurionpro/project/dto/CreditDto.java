package com.aurionpro.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDto {
	private String accountNumber;
    private Double amount;
    private String transactionDate;
}
