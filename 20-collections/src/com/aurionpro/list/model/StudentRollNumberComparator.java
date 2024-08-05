package com.aurionpro.list.model;
import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		if(student1.getRollno()>student2.getRollno())
			return 1;
		if(student1.getRollno()<student2.getRollno())
			return -1;
		return 0;
			
		
	}
}
