package com.aurionpro.test;



import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Book;
import com.aurionpro.model.EmailBookNotfier;
import com.aurionpro.model.Library;
import com.aurionpro.model.SMSBookNotifier;
import com.aurionpro.model.WhatsappBookNotifier;

public class User {
	public static Scanner scanner=new Scanner(System.in);
		
	public static String user="aagya";
	public static Library library;
	static Book book;
	public static List<String> action;
	public static void main(String[] args) {
		
		ChoseAction(book,library);	
		AskUser();
		
	}
	
	
	
	

	
		
	
	private static void ChoseAction(Book book, Library library) {
		// TODO Auto-generated method stub
		System.out.println("Which action you want to perform");
		System.out.println("1. Add book");
		System.out.println("2. Remove book");
		System.out.println("3. Borrow Book");
		System.out.println("4.Return book");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Enter title");
			String title=scanner.next();
			System.out.println("Enter author name");
			String authorname=scanner.next();
			library.addBook(new Book(title,authorname));
		
			
		
		}
	}





	private static void AskUser() {
		// TODO Auto-generated method stub
		System.out.println("Where do you want notification. 1.Email, 2.SMS, 3.Whatsapp");
		int choice=scanner.nextInt();
		
		if(choice==1) {
			library.registerbooknotifiers(new EmailBookNotfier());
		}
		else if(choice==2) {
			library.registerbooknotifiers(new SMSBookNotifier());
		}
		else if(choice==3) {
			library.registerbooknotifiers(new WhatsappBookNotifier());
			}
	}
}
