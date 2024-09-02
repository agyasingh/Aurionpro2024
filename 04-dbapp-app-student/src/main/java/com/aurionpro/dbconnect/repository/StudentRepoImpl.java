package com.aurionpro.dbconnect.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entity.Student;
@Repository
public class StudentRepoImpl implements StudentRepository{
    @Autowired
    private EntityManager manager;
    
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return getAllStudents();
	}

	@Override
	public Student getStudent(int rollnumber) {
		// TODO Auto-generated method stub
		return getStudent(rollnumber);
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		manager.persist(student);
	}
	
	

}
