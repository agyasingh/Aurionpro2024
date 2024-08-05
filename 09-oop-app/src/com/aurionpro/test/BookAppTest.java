package com.aurionpro.test;

import java.util.Scanner;
import java.util.Arrays;
import com.aurionpro.model.BookApp;

public class BookAppTest {
	private static BookApp[] books;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of books you want in your kindle application!");
		int numberOfBooks = scanner.nextInt();
		books = new BookApp[numberOfBooks]; 
		
		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("Set the book id");
			int bookid = scanner.nextInt();
			
			System.out.println("Enter name");
			String name = scanner.next();
			
			System.out.println("Enter the author");
			String author = scanner.next();
			
			System.out.println("Enter the price you want to set");
			int price = scanner.nextInt();
			
			books[i] = new BookApp(bookid, name, author, price);
		}
		
		// Sort books based on price
		sortBooks();
		
		// Display sorted books
		for (BookApp book : books) {
			book.display();
		}
	}
	
	private static void sortBooks() {
		for (int i = 0; i < books.length - 1; i++) {
			for (int j = 0; j < books.length - i - 1; j++) {
				if (books[j].getPrice() > books[j + 1].getPrice()) {
					BookApp temp = books[j];
					books[j] = books[j + 1];
					books[j + 1] = temp;
				}
			}
		}
	}
}
