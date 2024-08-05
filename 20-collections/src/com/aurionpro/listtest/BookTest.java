package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Book;  
import com.aurionpro.list.model.BookComparator;  

public class BookTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        System.out.println("Enter the number of books you want to create:");
        int numberOfBooks = scanner.nextInt();
        bookCreation(books, numberOfBooks);

        sortAuthorTitlePrice(books);
        sortPublicationyearPriceAuthor(books);
    }

    private static void bookCreation(List<Book> books, int numberOfBooks) {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter the title:");
            String title = scanner.next();
            scanner.nextLine();  

            System.out.println("Enter the price:");
            double price = scanner.nextDouble();

            System.out.println("Enter the author:");
            String author = scanner.next();

            System.out.println("Enter the publication year:");
            int publicationYear = scanner.nextInt();

            books.add(new Book(title, author, price, publicationYear));
        }

        System.out.println("Books created:");
        for (Book book : books) {
            System.out.println(book);  
        }
    }

    private static void sortAuthorTitlePrice(List<Book> books) {
        Collections.sort(books, new BookComparator.BookAuthorComparator()
                .thenComparing(new BookComparator.BookTitleComparator())
                .thenComparing(new BookComparator.BookPriceComparator()));

        System.out.println("Books sorted by author, title, and price:");
        for (Book book : books) {
            System.out.println(book);  
        }
        System.out.println();  
    }

    private static void sortPublicationyearPriceAuthor(List<Book> books) {
        Collections.sort(books, new BookComparator.BookPublicationYearComparator()
                .thenComparing(new BookComparator.BookPriceComparator())
                .thenComparing(new BookComparator.BookAuthorComparator()));

        System.out.println("Books sorted by publication year, price, and author:");
        for (Book book : books) {
            System.out.println(book); 
        }
        System.out.println();  
    }
}
