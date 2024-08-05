package com.aurionpro.listtest;
import com.aurionpro.list.model.StudentComparator;

import java.util.*;
import com.aurionpro.list.model.*;

public class StudentTest {
public static void main(String[] args) {
	List<Student> students= new ArrayList<Student>();
	Scanner scanner=new Scanner(System.in);
	
	students.add(new Student(2,"namrata",80));
	students.add(new Student(4,"Neha" ,75));
	students.add(new Student(1,"Sayali", 85));
	students.add(new Student(5,"aagya",90));
	System.out.println("Before sorting");
	System.out.println(students);
	
	Collections.sort(students, new StudentComparator.StudentRollNumberComparator());
	Collections.sort(students, new StudentComparator.StudentNameComparator());
	
	System.out.println("After sorting");
	System.out.println(students);

	
//	readStudents(students, scanner);
//	printStudents(students);
	
	

}
//private static void readStudents(List<Student> students,Scanner scanner) {
//	for(int i=0;i<10;i++) {
//		System.out.println("Enter roll number");
//		int rollno=scanner.nextInt();
//		System.out.println("Enter name");
//		String name=scanner.next();
//		System.out.println("Enter percentage");
//		double percentage=scanner.nextInt();
//		
//		students.add(new Student(rollno,name,percentage));
//	}
//}
//private static void printStudents(List<Student> students ) {
//	for(Student student:students) {
//		System.out.println(student);
//	}
//}
}
