package com.aurionpro.project.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column
    private Double amount;

    @Column
    private String transactionDate;

    @Enumerated(EnumType.STRING)
    @Column
    private TransactionStatus transactionStatus;

    @Enumerated(EnumType.STRING)
    @Column
    private TransactionType transactionType;

   
  
    @ManyToOne
    @JoinColumn(name = "sender_account_number", referencedColumnName = "accountNumber")
    private Account senderAccount;

   
    @ManyToOne
    @JoinColumn(name = "receiver_account_number", referencedColumnName = "accountNumber")
    private Account receiverAccount;

    
}
