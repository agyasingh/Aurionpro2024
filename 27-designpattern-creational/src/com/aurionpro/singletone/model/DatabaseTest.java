package com.aurionpro.singletone.model;

import com.aurionpro.singleton.test.Database;

public class DatabaseTest {
public static void main(String[] args) {
	Database d1=Database.getDatabase();
	d1.status();
}
}
