package com.aurionpro.jpacrud.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transactionId")
    private long transactionId;
    
    @Column(name="transactionDate")
    private LocalDate transactionDate;
    
    @Column(name="amount")
    private long amount;
    
    @Enumerated(EnumType.STRING)
    @Column(name="transactionStatus")
    private TransactionStatus transactionStatus;
    

    
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name="acountNumber")
    private SalaryAccount salaryAccount;
    
//    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinColumn(name="salaryId")
//    private Salary salary;
    
}
