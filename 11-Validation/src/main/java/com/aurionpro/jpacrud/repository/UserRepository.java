package com.aurionpro.jpacrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}