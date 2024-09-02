package com.aurionpro.jpacrud.services;

import java.util.List;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.ClientDto;
import com.aurionpro.jpacrud.entities.Client;
import com.aurionpro.jpacrud.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientrepo;

	@Override
	public Client addClient(ClientDto clientDto) {
		// TODO Auto-generated method stub
		Client client=new Client();
		client.setCompanyName(clientDto.getCompanyName());
		client.setContactEmail(clientDto.getContactEmail());
		client.setContactNumber(clientDto.getContactNumber());
		client.setContactPerson(clientDto.getContactPerson());
		client.setAddress(clientDto.getAddress());
		client.setCreationDate(clientDto.getCreationDate());
		client.setKycstatus(clientDto.getKycstatus());
		client.setRegistrationNumber(clientDto.getRegistrationNumber());
		client.setStatus(clientDto.getStatus());
		return clientrepo.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientrepo.findAll();
	}

	@Override
	public Client findClientById(int clientId) {
	    Optional<Client> optionalClient = clientrepo.findById(clientId);
	    return optionalClient.orElse(null); 
	}

	

	

}
