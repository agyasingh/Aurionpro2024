package com.aurionpro.jpacrud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.CourseDto;
import com.aurionpro.jpacrud.dto.InstructorDto;
import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Course;
import com.aurionpro.jpacrud.entities.Instructor;
import com.aurionpro.jpacrud.repositories.CourseRepository;
import com.aurionpro.jpacrud.repositories.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;

    @Override
    public InstructorDto addInstructor(InstructorDto instructorDto) {
        Instructor instructor = toInstructorMapper(instructorDto);
        Instructor instructorDb = instructorRepository.save(instructor);
        return toInstructorDtoMapper(instructorDb);
    }

    private Instructor toInstructorMapper(InstructorDto instructorDto) {
        Instructor instructor = new Instructor();
        instructor.setInstructorName(instructorDto.getInstructorName());
        instructor.setEmail(instructorDto.getEmail());
        instructor.setQualification(instructorDto.getQualification());
        return instructor;
    }

    private InstructorDto toInstructorDtoMapper(Instructor instructor) {
        InstructorDto instructorDto = new InstructorDto();
        instructorDto.setInstructorId(instructor.getInstructorId());
        instructorDto.setQualification(instructor.getQualification());
        instructorDto.setEmail(instructor.getEmail());
        instructorDto.setInstructorName(instructor.getInstructorName());
        return instructorDto;
    }

    @Override
    public Instructor allocateCourses(int instructorId, List<Integer> courseIds) {
        Instructor dbInstructor = getInstructor(instructorId);
        
        List<Course> dbCourses = new ArrayList<>();
        
        courseIds.forEach(courseId -> {
            Course course = courseRepository.findById(courseId).orElseThrow(() -> 
                new RuntimeException("Course not found")
            );
            course.setInstructor(dbInstructor);
            dbCourses.add(course);
        });

        dbInstructor.setCourses(dbCourses);
        return instructorRepository.save(dbInstructor);
    }

    @Override
    public Instructor getInstructor(int instructorId) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(instructorId);
        
       if(!optionalInstructor.isPresent())return null;
       else {return optionalInstructor.get();}
    }

    @Override
    public Page<InstructorDto> getAllInstructors(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Instructor> instructorPage = instructorRepository.findAll(pageable);

        return instructorPage.map(this::toInstructorDtoMapper);
    }

	@Override
	public List<Course> getInstructorCourses(int instructorId) {
		// TODO Auto-generated method stub
		return null;
	}
}
