package com.aurionpro.test;

import java.io.IOException;
import java.sql.Statement;

import com.aurionpro.model.DbConnection;

public class TestConnection {
	public static void main(String[] args) throws IOException {
		
		DbConnection connection=new DbConnection();
		connection.connectToDb();
		connection.getDepartmentDetails();
		connection.addDepartment();
		connection.getDepartmentDetails();
		
	}
	

}
