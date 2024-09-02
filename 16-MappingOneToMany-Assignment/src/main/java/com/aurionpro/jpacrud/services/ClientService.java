package com.aurionpro.jpacrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.ClientDto;
import com.aurionpro.jpacrud.entities.Client;

@Service
public interface ClientService {
	
	Client addClient(ClientDto clientDto);

	List<Client> getAllClients();
	
	Client findClientById(int clientId);

}
