package com.utilities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.thinkitive.Book;

public class Main {
	public static void main(String[] args) {
		Set<String> authorBook1 = new HashSet<>();
		authorBook1.add("RK Shanon");
		authorBook1.add("ABC");
		Book b1 = new Book(1,"Zeke Paradis", authorBook1, 5200);

		Set<String> authorBook2 = new HashSet<>();
		authorBook2.add("JK Rowling");
		authorBook2.add("XYZ");
		authorBook2.add("LMN");
		Book b2 = new Book(2,"Harry Potter", authorBook2, 3250);
		
		Set<String> authorBook3 = new HashSet<>();
		authorBook3.add("Helena Grinder");
		authorBook3.add("PQR");
		Book b3 = new Book(3,"One of us is Lying", authorBook3, 2200);
		
		
		StoreUtil<Book> su = new StoreUtil<Book>();
		su.addRecords(b1);
		su.addRecords(b2);
		su.addRecords(b3);
		List<Book> resultList = su.getRecords();
		
		System.out.println("############################");
		System.out.println("Total number of Books: "+su.getNumOfRecords());
		System.out.println("############################\n");
		
		System.out.println("#Sorted by Name:\n");
		SortUtils.sortByName(resultList);
		PrintUtil.printRecords(resultList);
		
		System.out.println("#######################################################\n");

		System.out.println("#Sorted by Price:\n");
		SortUtils.sortByPrice(resultList);
		PrintUtil.printRecords(resultList);
		
		
		
	}
}
