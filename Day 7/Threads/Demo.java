package com.thinkitive.threads;

public class Demo {
	public static void main(String[] args) {
		TablePrinter table = new TablePrinter();

		ThreadOne to = new ThreadOne(table); // Runnable Target
		Thread t1 = new Thread(to);

		ThreadTwo tt = new ThreadTwo(table); // Runnable Target
		Thread t2 = new Thread(tt, "dusra"); // setName using constructor

		t1.setName("Pahila"); // or set it using setter mthd
		t1.setPriority(10);
//		t1.setDaemon(true); // becomes a background running process

		t1.start();
		t2.start();
	}
}
