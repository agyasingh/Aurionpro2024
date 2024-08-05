package com.aurionpro.creational.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> employeeList;
	
	//Constructor to initialize the employeeList.
	
	public Employees() {
		employeeList=new ArrayList<String>();
	}
	
	//Constructor to initialize employeeList with existing list 
	 // Constructor to initialize empList with an existing list
    public Employees(List<String> list) {
        this.employeeList = list;
    }
    
    // Method to load employee data
	public void loadData() {
		   // Simulate fetching data from a database
		employeeList.add("aagya");
		employeeList.add("Pankaj");
        employeeList.add("David");
        employeeList.add("Lisa");
	}
	
	//getting employee list
	
	public List<String> getEmployeeList() {
        return employeeList;
    }
	

    // Overriding clone() method to provide deep copy of empList
    @Override
	
	public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmployeeList()) {
            temp.add(s);
        }
        return new Employees(temp); // Create and return a new Employees object with the copied list
    }

	
//    By using the Prototype Design Pattern, the solution 
//    efficiently creates new Employees objects by cloning an 
//    existing object. This avoids the need for multiple 
//    database calls, making the process faster and less 
//    resource-intensive. The clone() method ensures that 
//    each new object has a deep copy of the empList, allowing 
//    modifications without affecting the original list or other clones.
//	A deep copy means creating a new instance of an object that is a complete copy of the original object, including copies of any objects referenced by the original object. This ensures that changes made to the copied object do not affect the original object, and vice versa.
//

}
