package com.aurionpro.model;

import java.util.List;

import com.aurionpro.test.User;

public class SMSBookNotifier implements IBookNotifier{

	@Override
	public void notify(Library library, Book book, User user,String action) {
		// TODO Auto-generated method stub
		System.out.println("SMS Notfication " + user + "has "  + "on " + book.getTitle());
	
	}
	
}
