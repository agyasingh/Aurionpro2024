package com.aurionpro.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDto {
	private String senderAccountNumber;
    private String receiverAccountNumber;
    private Double amount;
    private String transactionDate;

}
