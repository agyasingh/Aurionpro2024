package com.aurionpro.jpacrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.aurionpro.jpacrud.entities.Client;
import com.aurionpro.jpacrud.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientrepo;

	@Override
	public Page<Client> getAllClients(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNumber, pageSize);
		Page<Client> clientPage=clientrepo.findAll(pageable);
		return clientPage;
	}

	@Override
	public Page<Client> findByCompanyName(String companyName, int pageNumber, int pageSize, Sort.Direction sortDirection) {
	    // Create Pageable with dynamic sorting direction
	    Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortDirection, "companyName"));
	    return clientrepo.findByCompanyName(companyName, pageable);
	}

}
