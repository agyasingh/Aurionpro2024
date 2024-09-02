package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entity.Student;
import com.aurionpro.jpacrud.errors.StudentErrorResponse;
import com.aurionpro.jpacrud.exceptions.StudentNotFoundException;
import com.aurionpro.jpacrud.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepository studentrepo;
	
	
	@Override
	public PageResponse<Student> getAllStudentsByName(String name,int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo,pageSize);
		Page<Student> studentPage=studentrepo.findByName(name,pageable);
		PageResponse studentpageresponse=new PageResponse<>();
		studentpageresponse.setTotalPages(studentPage.getTotalPages());
		studentpageresponse.setSize(studentPage.getSize());
		studentpageresponse.setTotalelements(studentPage.getNumberOfElements());
		studentpageresponse.setContent(studentPage.getContent());
		studentpageresponse.setLastPage(studentPage.isLast());
		return studentpageresponse;
	}



	@Override
	public PageResponse<Student> getAllStudents(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Student> studentPage=studentrepo.findAll(pageable);
		PageResponse studentpageresponse=new PageResponse<>();
		studentpageresponse.setTotalPages(studentPage.getTotalPages());
		studentpageresponse.setSize(studentPage.getSize());
		studentpageresponse.setTotalelements(studentPage.getNumberOfElements());
		studentpageresponse.setContent(studentPage.getContent());
		studentpageresponse.setLastPage(studentPage.isLast());
		return studentpageresponse;
	}



	@Override
	public Student getStudentByRollNumber(int rollnumber) {
		
		// TODO Auto-generated method stub
		Student student=null;
		Optional<Student> dbStudent=studentrepo.findById(rollnumber);
		if(!dbStudent.isPresent()) {
			throw new StudentNotFoundException();
		}
		return student;
	}



	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}

}
