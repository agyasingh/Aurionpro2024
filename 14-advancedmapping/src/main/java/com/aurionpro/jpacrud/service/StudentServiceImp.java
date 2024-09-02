package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Address;
import com.aurionpro.jpacrud.entities.Student;
import com.aurionpro.jpacrud.repositories.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository studentrepo;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
				
	}
//	
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
	
	
	
	
	public Address getStudentAddress(int rollnumber) {
		Student dbStudent=null;
		Optional<Student> optionalStudent=studentrepo.findById(rollnumber);
		if(!optionalStudent.isPresent()) {
			return null;
		}
		dbStudent=optionalStudent.get();
		
		return dbStudent.getAddress();
	}
	
	
	@Override
	public Address updateStudentAddress(int rollnumber, Address address) {
		// TODO Auto-generated method stub
		Student dbStudent=null;
		Optional<Student> optionalStudent=studentrepo.findById(rollnumber);
		if(!optionalStudent.isPresent()) {
			return null;
		}
		dbStudent=optionalStudent.get();
		Address dbAddress=dbStudent.getAddress();
		dbAddress.setCity(address.getCity());
		dbStudent.setAddress(dbAddress);
		Student student =studentrepo.save(dbStudent);
		
		return student.getAddress();
		
	}
	@Override
	public void deleteStudent(int rollnumber) {
		// TODO Auto-generated method stub
		Optional<Student> optionalstudent=studentrepo.findById(rollnumber);
		Student student=null;
		if(optionalstudent.isPresent()) {
			studentrepo.deleteById(rollnumber);
		}
		
	}
	
	
	
	

	
}
