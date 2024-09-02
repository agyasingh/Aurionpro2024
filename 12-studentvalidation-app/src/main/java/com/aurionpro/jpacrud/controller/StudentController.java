package com.aurionpro.jpacrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entity.Student;
import com.aurionpro.jpacrud.errors.StudentErrorResponse;
import com.aurionpro.jpacrud.exceptions.StudentNotFoundException;
import com.aurionpro.jpacrud.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/students")
	public ResponseEntity<PageResponse<Student>> getAllStudents(
            @RequestParam(required = false) String name, 
            @RequestParam int pageNo, 
            @RequestParam int pageSize) {
        
        if (name != null) {
            return ResponseEntity.ok(studentservice.getAllStudentsByName(name, pageNo, pageSize));
        } else {
            return ResponseEntity.ok(studentservice.getAllStudents(pageNo, pageSize));
        }
    }
	
	@GetMapping("/students/getrollnumber")
	public ResponseEntity<Student> getStudentByRollNumber(@RequestParam int rollnumber){
		return ResponseEntity.ok(studentservice.getStudentByRollNumber(rollnumber));
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addNewStudent(@Valid @RequestBody Student student){

		return ResponseEntity.ok(studentservice.addStudent(student));
	}
	
	
	
	

}
