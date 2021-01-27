package com.thinkitive.threads;

public class ThreadOne implements Runnable {
	TablePrinter tab;

	ThreadOne(TablePrinter tab) {
		this.tab = tab;
	}

	@Override
	public void run() {
//		TablePrinter.tableOf(2); 
		this.tab.tableOf(2);
	}
}
