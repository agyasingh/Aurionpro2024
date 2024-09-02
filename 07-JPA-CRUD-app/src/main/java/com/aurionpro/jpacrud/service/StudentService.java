package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.aurionpro.jpacrud.entity.*;

public interface StudentService {
	
	List<Student> getAllStudents();
	List<Student> getAllStudentsByName(String name);
    void deleteStudent(int rollnumber);
    Optional<Student> findStudent(int rollnumber);
    void addStudent(Student student);
}
