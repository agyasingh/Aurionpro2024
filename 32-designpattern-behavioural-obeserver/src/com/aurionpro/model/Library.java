package com.aurionpro.model;
import java.util.List;

import com.aurionpro.test.User;

public class Library {
	protected User user;
	List<Book> books;
	List<IBookNotifier> booknotifiers;
	
	
	
	public Library(List<Book> books, List<IBookNotifier> booknotifiers) {
		super();
		this.books = books;
		this.booknotifiers = booknotifiers;
	}
	//state of book changes notify the notifiers
	
	
	public Library(Book book) {
		// TODO Auto-generated constructor stub
		super();
		this.books = books;
	}


	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<IBookNotifier> getNotifiers() {
		return booknotifiers;
	}

	public void setNotifiers(List<IBookNotifier> notifiers) {
		this.booknotifiers = notifiers;
	}
	
	public String addBook(Book book) {
		books.add(book);
		notifybooknotfiers(book,user,"added");
		return null;
		
	}
	

	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public void borrowBook(Book book, String user,String action){
		books.remove(book);
	}
	
	public void returnBook(Book book,String user,String action) {
	}
	//state change
	public void registerbooknotifiers(IBookNotifier booknotifier){
		booknotifiers.add(booknotifier);
	}
	
	//notify
	

	public void notifybooknotfiers(Book book, User user,String action) {
		// TODO Auto-generated method stub
		for(IBookNotifier booknotifier:booknotifiers) {
			booknotifier.notify(this, book,user,action);
		}
	}

}
