package com.aurionpro.dbconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.aurionpro.dbconnect.service.StudentService;

public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		return ResponseEntity.ok(studentService.getAllStudents());
		
		//fetch a student whose roll number is 1-client se aayega
		
		
	}
	
	@GetMapping("/students/{rollnumber}")
    public ResponseEntity<Student> getStudent(@PathVariable int rollnumber)
    {
		return ReponseEntity.ok(studentService.getStudent(rollnumber));
    }
	
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student) {
	   studentService.addStudent(student);
	   return "record added successfully";
	}
	
	
	

}
