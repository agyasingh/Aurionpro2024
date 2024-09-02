package com.aurionpro.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.dto.InstructorDto;
import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Course;
import com.aurionpro.jpacrud.entities.Instructor;

@Service
public interface InstructorService {
	
	InstructorDto addInstructor(InstructorDto instructorDto);  
	Instructor allocateCourses(int instructorId, List<Integer> courseIds);
	Instructor getInstructor(int instructorId);
	//get courses of instructor
	List<Course> getInstructorCourses(int instructorId);
	
	public Page<InstructorDto> getAllInstructors(int pageNo,int pageSize);
	
	
	
}
