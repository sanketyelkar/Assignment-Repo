package com.thinkitive.threads;

public class ThreadTwo implements Runnable {
	TablePrinter tab ;

	ThreadTwo(TablePrinter tab) {
		this.tab = tab;
	}

	@Override
	public void run() {
//		TablePrinter.tableOf(3); 
		this.tab.tableOf(3);
	}
}
