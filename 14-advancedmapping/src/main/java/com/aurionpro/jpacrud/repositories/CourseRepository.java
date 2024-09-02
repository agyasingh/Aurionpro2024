package com.aurionpro.jpacrud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Course;
import com.aurionpro.jpacrud.entities.Instructor;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	List<Course> findAllByInstructor(Instructor instructor);
}
