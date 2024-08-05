package com.aurionpro.list.model;

import java.util.Comparator;

public class BookComparator {
	public static class BookTitleComparator implements Comparator<Book> {
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getTitle().compareTo(book2.getTitle());
		}
	}

	
	
	public static class BookAuthorComparator implements Comparator<Book>{
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
		
	}

	
	
public static class BookPriceComparator implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			double price1=book1.getPrice();
			double price2=book2.getPrice();
			
			if(price1<price2) {
				return -1;
			}
			else if(price1>price2) {
				return 1;
			}
			else return 0;
		}
	}

public static class BookPublicationYearComparator implements Comparator<Book>{
	@Override
	public int compare(Book book1, Book book2) {
		// TODO Auto-generated method stub
		//1960>1970> -1
		//1960 < 1970
		int publicationYear1=book1.getPublicationYear();
		int publicationYear2=book2.getPublicationYear();
		
		if(publicationYear1<publicationYear2) {
			return 1;
		}
		else if(publicationYear1>publicationYear2) {
			return -1;
		}
		else return 0;
		
		}
}
	
	


}
