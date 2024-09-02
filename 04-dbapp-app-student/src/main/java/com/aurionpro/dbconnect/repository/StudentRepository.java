package com.aurionpro.dbconnect.repository;

import java.util.List;

import com.aurionpro.dbconnect.entity.Student;

public interface StudentRepository {

	List<Student> getAllStudents();
	Student getStudent(int rollnumber);
    void addStudent(Student student);
}
