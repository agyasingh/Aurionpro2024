package com.aurionpro.test;

import java.io.IOException;

import com.aurionpro.model.TransactionProcessingDbConnection;

public class TransactionDbTest {
	
	public static void main(String[] args) {
		TransactionProcessingDbConnection test=new TransactionProcessingDbConnection();
		test.connectToDb();
		test.getDepartmentDetails();
		try {
			test.addDepartment();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.getDepartmentDetails();
	}

}
