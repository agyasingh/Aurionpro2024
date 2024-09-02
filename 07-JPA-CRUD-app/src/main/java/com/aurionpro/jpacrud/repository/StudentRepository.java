package com.aurionpro.jpacrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	//interface can extend other interface.
	//only if i have custom requirements i will need to declare a method.
    List<Student> findByName(String name);
    
}
