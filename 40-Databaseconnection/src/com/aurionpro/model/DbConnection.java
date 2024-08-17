package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DbConnection {
	
	private Connection connection=null;
	private Statement statement=null;
	private PreparedStatement preparedStatement=null;
	public void connectToDb() {
		
		
		
		try {
			
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/organization","root","root");
			
			
			
			System.out.println("Connection successful");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getDepartmentDetails() {
		
		
		try {
			//create statement
			statement=connection.createStatement();
			
			//ResultSet me apan query daalte hai using executeQuery() method.
			ResultSet dbDepartmentData=statement.executeQuery("select * from department");
			
			//printing the columns one by one
			
			while(dbDepartmentData.next()) {
				System.out.println("  \t" + dbDepartmentData.getInt("Dno") + "  \t"  + dbDepartmentData.getString("Dname") +"  \t" +dbDepartmentData.getString("DLocation"));
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Records fetched successfully");
	
	}
	
	public void addDepartment() throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter department details");
	
		System.out.println("Enter D no");
		int Dno=scanner.nextInt();
		
		System.out.println("Enter Dname");
		String Dname=scanner.next();
		
		System.out.println("Enter Dlocation");
        String Dlocation=bufferreader.readLine();
		
		
		
		try {
			preparedStatement=connection.prepareStatement("insert into department values(?,?,?)");
			//setting blank rows and setting up value there
			preparedStatement.setInt(1,Dno);
			
			preparedStatement.setString(2, Dname);
			
			preparedStatement.setString(3, Dlocation);
			
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			statement.executeUpdate("INSERT INTO department VALUES(" + Dno + ", '" + Dname + "', '" + Dlocation + "')");
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Record inserted successfully");
	}

	
	
}
