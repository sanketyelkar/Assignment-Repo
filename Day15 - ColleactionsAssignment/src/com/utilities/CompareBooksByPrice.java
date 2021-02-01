package com.utilities;

import java.util.Comparator;

import com.thinkitive.Book;

public class CompareBooksByPrice implements Comparator<Book> {

	public CompareBooksByPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getPrice() - o2.getPrice();
	}

}
