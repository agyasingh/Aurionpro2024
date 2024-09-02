package com.aurionpro.jwtsecured.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jwtsecured.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
 Optional<User> findByUsername(String username);
boolean	existsByUsername(String username);

}
