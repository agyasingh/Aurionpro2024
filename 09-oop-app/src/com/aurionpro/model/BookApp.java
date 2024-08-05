package com.aurionpro.model;

public class BookApp {
	private int bookId;
	private String name;
	private String author;
	private int price;
	
	
	public BookApp(int BookId, String name,String author,int price) {
		this.bookId=bookId;
		this.name=name;
		this.author=author;
		this.price=price;	
	}
	
	public void setBookId(){
		this.bookId=bookId;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public void setAuthor() {
		this.author=author;
	}
	
	public void setPrice() {
		this.price=price;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	public void display() {
		System.out.println("The book id is" + " " +getBookId());
		System.out.println("The name of the book is" + " " + getName());
		System.out.println("The author of the book is" + " " + getAuthor());
		System.out.println("The price of the book is" + " " + getPrice());
		
	}
	
	

}

