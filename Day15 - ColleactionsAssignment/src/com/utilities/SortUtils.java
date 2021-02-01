package com.utilities;

import java.util.Collections;
import java.util.List;

import com.thinkitive.Book;

public class SortUtils {

	public SortUtils() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void sortByName(List<Book> l) {
		Collections.sort(l, new CompareBooksByName());
	}

	public static void sortByPrice(List<Book> l) {
		Collections.sort(l, new CompareBooksByPrice());
	}
}
