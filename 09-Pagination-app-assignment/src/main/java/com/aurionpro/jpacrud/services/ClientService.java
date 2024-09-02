package com.aurionpro.jpacrud.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.aurionpro.jpacrud.entities.Client;

public interface ClientService {
	
	Page<Client> getAllClients(int pageNumber,int pageSize);
	
    Page<Client>findByCompanyName(String companyName, int pageNumber, int pageSize, Sort.Direction sortDirection);

}
