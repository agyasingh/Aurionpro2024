package com.aurionpro.project.repositories;


import com.aurionpro.project.dto.AdminDto;
import com.aurionpro.project.entities.Admin;

import jakarta.transaction.Transactional;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Optional<Admin> findByEmail(String email);
	
	 @Modifying
	 @Transactional
	 @Query("UPDATE Admin a SET a.email = :email WHERE a.id = :adminId")
	 void updateEmailById(Long adminId, String email);
}
