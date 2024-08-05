package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentComparator {
	
	
	public static class  StudentRollNumberComparator implements Comparator<Student> {

		public int compare(Student student1, Student student2) {
			if(student1.getRollno()>student2.getRollno())
				return 1;
			if(student1.getRollno()<student2.getRollno())
				return -1;
			return 0;
				
			
		}
	}
	
	public static class StudentNameComparator implements Comparator<Student> {

		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
				
			
		}
	}


}
