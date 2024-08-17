package com.aurionpro.test;

import java.sql.SQLException;

import com.aurionpro.model.DbConnection;
import com.aurionpro.model.DbMetadata;

public class TestMetadata {
public static void main(String[] args) throws SQLException {
	DbMetadata test=new DbMetadata();
	test.connectToDb();
	test.getTableMetadata("employee");
	
}
}
