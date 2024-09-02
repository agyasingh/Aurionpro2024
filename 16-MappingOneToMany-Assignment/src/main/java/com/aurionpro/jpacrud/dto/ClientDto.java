package com.aurionpro.jpacrud.dto;

import java.time.LocalDate;

import com.aurionpro.jpacrud.entities.Client.KycStatus;
import com.aurionpro.jpacrud.entities.Client.Status;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
	
	private int clientId;
	
	private String companyName;
	
	private String registrationNumber;
	
	private String contactPerson;
	
	private String contactEmail;
	
	private String contactNumber;
	
	private String address;
	
	private Status status;
	
	private LocalDate creationDate;
	
	@Enumerated(EnumType.STRING)
	private KycStatus Kycstatus;

}
