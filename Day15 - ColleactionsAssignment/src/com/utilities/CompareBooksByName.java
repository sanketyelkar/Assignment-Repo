package com.utilities;

import java.util.Comparator;

import com.thinkitive.Book;

public class CompareBooksByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookName().compareTo(o2.getBookName());
	}

	public CompareBooksByName() {
		super();
		// TODO Auto-generated constructor stub
	}

}
