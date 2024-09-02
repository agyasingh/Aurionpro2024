package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.jpacrud.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
