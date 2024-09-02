package com.aurionpro.jpacrud.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer>{

	Page<Instructor> findAll(Pageable pageable);

}
