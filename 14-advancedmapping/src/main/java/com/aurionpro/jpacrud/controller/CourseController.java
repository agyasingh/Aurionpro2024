package com.aurionpro.jpacrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.entities.Course;
import com.aurionpro.jpacrud.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/courses")
	public ResponseEntity<Course> addNewCourse(CourseDto courseDto){
		return ResponseEntity.ok(courseService.addCourses(courseDto));
	}

}
