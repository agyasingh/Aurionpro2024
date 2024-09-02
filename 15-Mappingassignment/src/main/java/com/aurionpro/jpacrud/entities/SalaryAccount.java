package com.aurionpro.jpacrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

}
