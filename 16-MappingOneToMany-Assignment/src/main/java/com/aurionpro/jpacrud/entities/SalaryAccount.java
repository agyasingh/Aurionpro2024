package com.aurionpro.jpacrud.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.aurionpro.jpacrud.entities.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="salaryaccount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryAccount {
	@Column(name="acountNumber")
	@Id
	private long accountNumber;
	
	@Column(name="accountHolderName")
	private String accountHolderName;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="bankId")
	private Bank bank;
	
	@OneToMany(mappedBy = "salaryAccount",cascade = { CascadeType.DETACH,CascadeType.REFRESH})
    @JsonIgnore
	List<SalaryTransaction> salaryTransactions;
	

}
