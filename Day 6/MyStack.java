package com.thinkitive;

import java.util.List;
import java.util.ArrayList;

public class MyStack<T> {
	List<T> l = new ArrayList<T>();
	
	public void push(T data) {
		l.add(data);
	}
	
	public T pop() {
		T data = (T) l.remove(l.size()-1);
		return data;
	}
	
	public void printStack() {
		System.out.println(l);
	}
}
