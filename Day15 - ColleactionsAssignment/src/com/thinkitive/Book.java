package com.thinkitive;

import java.util.Set;

public class Book {
	private int bid;
	private String bookName;
	private Set<String> authors;
	private int price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bookName, Set<String> authors, int price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.authors = authors;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Set<String> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[bid=" + bid + ", bookName=" + bookName + ", authors=" + authors + ", price=" + price + "]";
	}

}
