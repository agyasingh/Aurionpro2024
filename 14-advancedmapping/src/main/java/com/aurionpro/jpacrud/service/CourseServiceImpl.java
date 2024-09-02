package com.aurionpro.jpacrud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.entities.Course;
import com.aurionpro.jpacrud.entities.Instructor;
import com.aurionpro.jpacrud.repositories.CourseRepository;
import com.aurionpro.jpacrud.repositories.InstructorRepository;

@Service
public class CourseServiceImpl implements CourseService{
@Autowired
private CourseRepository courseRepo;

@Autowired
private InstructorRepository instructorRepository;
	@Override
	public Course addCourses(CourseDto courseDto) {
		// TODO Auto-generated method stub
		Course course=new Course();
		course.setCourseName(courseDto.getCourseName());
		course.setDuration(courseDto.getDuration());
		course.setFees(courseDto.getFees());
		course.setCourseId(courseDto.getCourseId());
		return courseRepo.save(course);
	}
	
	@Override
	public Course assignInstructorToCourse(int instructorId, int courseId) {
	    // Find the instructor by their ID using the instructor repository
	    Optional<Instructor> optionalInstructor = instructorRepository.findById(instructorId);
	    
	    // If the instructor doesn't exist, return null
	    if (!optionalInstructor.isPresent()) {
	        return null;
	    }
	    
	    // Get the instructor object
	    Instructor dbInstructor = optionalInstructor.get();
	    
	    // Find the course by its ID using the course repository
	    Optional<Course> optionalCourse = courseRepo.findById(courseId);
	    
	    // If the course doesn't exist, return null
	    if (!optionalCourse.isPresent()) {
	        return null;
	    }
	    
	    // Get the course object
	    Course dbCourse = optionalCourse.get();
	    
	    // Assign the instructor to the course
	    dbCourse.setInstructor(dbInstructor);
	    
	    // Save the updated course to the database
	    return courseRepo.save(dbCourse);
	}

	 @Override
	 public List<CourseDto> getAllCourse(int instructorId) {
	  List<CourseDto> courseDtos = new ArrayList<>();
	  List<Course> courses = courseRepo.findAllByInstructor(instructorRepository.findById(instructorId).get());
	  
	  courses.forEach(course -> {
	   courseDtos.add(toCourseDto(course));
	  });
	  
	  return courseDtos;
	 }
	 
	 private CourseDto toCourseDto(Course course) {
		  CourseDto courseDto = new CourseDto();
		  courseDto.setCourseId(course.getCourseId());
		  courseDto.setCourseName(course.getCourseName());
		  courseDto.setDuration(course.getDuration());
		  courseDto.setFees(course.getFees());
		  return courseDto;
		 }

	@Override
	public Course getCourseById(int courseId) {
		// TODO Auto-generated method stub
		Course dbCourse=null;
		Optional<Course> optionalCourse= courseRepo.findById(courseId);
		
		if(!optionalCourse.isPresent())
		return null;
		else {
			return optionalCourse.get();
		}
		
	}
	
	


}
