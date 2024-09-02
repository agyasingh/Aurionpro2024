package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entity.*;

public interface StudentService {
	
	PageResponse<Student> getAllStudents(int pageNo,int pageSize);
	
  
	PageResponse<Student> getAllStudentsByName(String name,int pageNo,int pageSize);


	Student getStudentByRollNumber(int rollnumber);
	
	Student addStudent(Student student);
}
