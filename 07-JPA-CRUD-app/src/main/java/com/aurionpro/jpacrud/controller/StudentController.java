package com.aurionpro.jpacrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.entity.Student;
import com.aurionpro.jpacrud.service.StudentService;

@RestController
@RequestMapping("/studentapp")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(@RequestParam String name){
		if(name!=null) {
			return ResponseEntity.ok(studentservice.getAllStudentsByName(name));
		}
		return ResponseEntity.ok(studentservice.getAllStudents());
	}
	
	@PostMapping("/students/{rollnumber}")
	public Optional<Student> findStudent(@PathVariable int rollnumber) {
		return studentservice.findStudent(rollnumber);
	}
	
	@DeleteMapping("/students/deletestudents")
	public String deleteStudent(@RequestParam (required = false) int rollnumber) {
		
		studentservice.deleteStudent(rollnumber);
		return "deleted student";
	}
	
	

}
