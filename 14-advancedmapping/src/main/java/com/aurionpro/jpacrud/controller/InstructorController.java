package com.aurionpro.jpacrud.controller;
import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.dto.InstructorDto;
import com.aurionpro.jpacrud.entities.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.service.InstructorService;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorservice;
	
	@PostMapping("/instructors")
	public ResponseEntity<InstructorDto> addNewInstructor(@RequestBody InstructorDto instructorDto){
		Instructor instructor=new Instructor();
		
		return ResponseEntity.ok(instructorservice.addInstructor(instructorDto));
	}
	
	public ResponseEntity<Instructor> allocateCourses(@RequestParam int instructorId,@RequestBody List<Integer> courseids){
		return ResponseEntity.ok(instructorservice.allocateCourses(instructorId,courseids));
	}
	
//	public ResponseEntity<Course> assignInstructorToCourse(@RequestParam  int courseId,@RequestBody int instructorId){
//		return ResponseEntity.ok(.assignInstructorToCourse(courseId, instructorId));
//		
//	}
	
	

}
