package com.aurionpro.jpacrud.service;
import java.util.*;

import com.aurionpro.jpacrud.dto.PageResponse;
import com.aurionpro.jpacrud.entities.Address;
import com.aurionpro.jpacrud.entities.Student;

public interface StudentService {
	
	Student addStudent(Student student);
    PageResponse<Student> getAllStudents(int pageNo,int pageSize);
    Address getStudentAddress(int rollnumber);
   // Address updateCity(int rollNumber, String newCity);
    Address updateStudentAddress(int rollnumber, Address address);
    
    public void deleteStudent(int rollnumber);
    
}
