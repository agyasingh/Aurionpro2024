package com.aurionpro.model;

import java.util.List;

import com.aurionpro.test.User;

public class WhatsappBookNotifier implements IBookNotifier{

	@Override
	public void notify(Library library, Book book, User user,String action) {
		// TODO Auto-generated method stub
		System.out.println("Whatsapp Notification " + user + "has performed" + action + "on book " +  book.getTitle());
		
	}

	
	
}
