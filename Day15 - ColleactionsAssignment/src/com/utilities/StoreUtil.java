package com.utilities;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {
	private List<T> list;

	public StoreUtil() {
		super();
		list = new ArrayList<>();
	}

	public void addRecords(T book) {
		list.add(book);
	}
	
	public List<T> getRecords(){
		return list;
	}
	
	public int getNumOfRecords() {
		return list.size();
	}
}
