package com.aurionpro.model;

import java.util.List;

import com.aurionpro.test.User;

public class EmailBookNotfier implements IBookNotifier {

	

	@Override
	public void notify(Library library, Book book, User user,String action) {
		System.out.println("Email notification: The"+ action + "is performed by" + user + "on book" + book.getTitle());
	}

}
