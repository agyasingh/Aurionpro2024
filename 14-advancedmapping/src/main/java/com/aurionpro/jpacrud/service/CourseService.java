package com.aurionpro.jpacrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.entities.Course;

@Service
public interface CourseService {
	
	Course addCourses(CourseDto courseDto);

	Course assignInstructorToCourse(int instructorId, int courseId);

	List<CourseDto> getAllCourse(int instructorId);
  
	Course getCourseById(int courseId);

}

