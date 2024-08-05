package com.aurionpro.list.model;

import java.util.Comparator;

public class EmployeeComparator {
	
	
	public static class  EmployeeIdComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return employee1.getEmployeeId()-employee2.getEmployeeId();
			
		}

		
	}
	
	public static class EmployeeNameComparator implements Comparator<Employee> {
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getName().compareTo(employee2.getName());
				
			
		}

		
	}


}
