package com.aurionpro.test;

import java.sql.SQLException;

import com.aurionpro.model.DatabaseUtil;


public class TestClass {
	public static void main(String[] args) {
		try {
			DatabaseUtil.getConnection();
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
