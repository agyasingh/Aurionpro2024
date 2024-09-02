package com.aurionpro.jpacrud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.ClientDto;
import com.aurionpro.jpacrud.entities.Client;
import com.aurionpro.jpacrud.services.ClientService;

@RestController
@RequestMapping("/bankapp")
public class ClientController {
	
	@Autowired
	private ClientService clientservice;
	
	@PostMapping("/clients")
	public ResponseEntity<Client> addNewClient(@RequestBody ClientDto clientDto){
		return ResponseEntity.ok(clientservice.addClient(clientDto));
	}
	
	@GetMapping("/getallclients")
	public ResponseEntity<List<Client>> getAllClients(){
		return ResponseEntity.ok(clientservice.getAllClients());
	}
	
	@GetMapping("/clients/{clientId}")
	public ResponseEntity<Client> getClientById(@PathVariable int clientId){
		return ResponseEntity.ok(clientservice.findClientById(clientId));
	}

}
