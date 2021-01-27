package com.thinkitive.threads;

public class TablePrinter {
	// static kadlas tr commom object ni -
	// - invoke karava lagel ha mthd from our ThreadClasses

//	public synchronized static void tableOf(int num) { 
	public synchronized void tableOf(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + num + " * " + i + " = " + (num * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
