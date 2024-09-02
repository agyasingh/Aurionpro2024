package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{

}
