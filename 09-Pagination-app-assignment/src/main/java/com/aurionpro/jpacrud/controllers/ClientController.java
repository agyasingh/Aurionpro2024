package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.entities.Client;
import com.aurionpro.jpacrud.services.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientservice;
	
	@GetMapping("/clients")
	public Page<Client> getAllClients(
	        @RequestParam(required = false) String companyName,
	        @RequestParam(defaultValue = "0") int pageNumber,
	        @RequestParam(defaultValue = "1") int pageSize,
	        @RequestParam(defaultValue = "ASC") Sort.Direction sortDirection) {

	    if (companyName != null) {
	        return clientservice.findByCompanyName(companyName, pageNumber, pageSize, sortDirection);
	    }
	    return clientservice.getAllClients(pageNumber, pageSize);
	}
}
