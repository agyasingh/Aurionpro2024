package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.entity.Student;
import com.aurionpro.jpacrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepository studentrepo;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}
	
	public void addStudent(Student student) {
		studentrepo.save(student);
	}
	
	public Optional<Student> findStudent(int rollnumber) {
		Optional<Student> student=studentrepo.findById(rollnumber);
		return student;
	}
	
	
	public void deleteStudent(int rollnumber) {
		studentrepo.deleteById(rollnumber);
	}

	@Override
	public List<Student> getAllStudentsByName(String name) {
		// TODO Auto-generated method stub
		return studentrepo.findByName(name);
	}

}
