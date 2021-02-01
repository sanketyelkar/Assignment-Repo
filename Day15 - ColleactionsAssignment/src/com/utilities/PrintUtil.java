package com.utilities;

import java.util.Iterator;
import java.util.List;

import com.thinkitive.Book;

public class PrintUtil {
	
	public PrintUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void printRecords(List<Book> list) {
		for (Book book : list) {
			System.out.println("Book EID: "+book.getBid() + "\nBook Name: " + book.getBookName()
			+ "\nAuthors: " + book.getAuthors() + "\nPrice: " + book.getPrice());
			System.out.println("------------------------------------------");
		}
	}
}
