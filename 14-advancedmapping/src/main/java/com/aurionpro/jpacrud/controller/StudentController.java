package com.aurionpro.jpacrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Address;
import com.aurionpro.jpacrud.entities.Student;
import com.aurionpro.jpacrud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/students")
	
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return ResponseEntity.ok(studentservice.addStudent(student));
	}
	
	@GetMapping("/getallstudents")
	public ResponseEntity<PageResponse<Student>> getAllStudents(
            
            @RequestParam int pageNo, 
            @RequestParam int pageSize) {
        
                    return ResponseEntity.ok(studentservice.getAllStudents(pageNo, pageSize));
     
    }
	
	@GetMapping("students/{rollnumber}")
	public ResponseEntity<Address> getStudentAddress(@PathVariable int rollnumber){
		return ResponseEntity.ok(studentservice.getStudentAddress(rollnumber));
	}
	
	@PutMapping("students/{rollnumber}")
	public ResponseEntity<Address> updateStudentAddress(@PathVariable int rollnumber,@RequestBody Address address){
		return ResponseEntity.ok(studentservice.updateStudentAddress(rollnumber, address));
	}
	
	@DeleteMapping("/students")
	public String  deleteStudent(@RequestParam int rollnumber) {
		  studentservice.deleteStudent(rollnumber);
		  return "student deleted successfully";
	}
     
      
    }

