package com.aurionpro.project.dto;

import com.aurionpro.project.entities.TransactionStatus;
import com.aurionpro.project.entities.TransactionType;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private Double amount;
    private String transactionDate;
    private TransactionStatus transactionStatus;
    private TransactionType transactionType;
    private String senderAccountNumber;
    private String receiverAccountNumber;
}
