package com.aurionpro.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column
    private AccountType accountType;

    @Column 
    private Double balance;

    @Column
    private LocalDate createdAt;

    @ManyToOne(cascade = { CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;

  
    @OneToMany(mappedBy = "senderAccount", cascade = { CascadeType.DETACH, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Transaction> sentTransactions;

   
    @OneToMany(mappedBy = "receiverAccount", cascade = { CascadeType.DETACH, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Transaction> receivedTransactions;
}
