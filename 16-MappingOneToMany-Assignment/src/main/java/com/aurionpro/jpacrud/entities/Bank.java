package com.aurionpro.jpacrud.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bank")
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bankId")
    private long bankId;
    
    @Column(name="bankName")
    private String bankName;
    
    @Column(name="ifscno")
    private String ifscno;
    
    @OneToMany(mappedBy ="bank", cascade = {CascadeType.DETACH, CascadeType.REFRESH})
    @JsonIgnore
    List<SalaryAccount> salaryAccount;
}






