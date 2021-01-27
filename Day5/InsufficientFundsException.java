package com.thinkitive;

//extends to Exception class means we are creating a Compile-time (checked) Exception, which needs to be
//handled.

//extending to RuntimeException makes it Unchecked Exception, need not be handled but better if handled.
public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(int needs) {
		super("Funds are not Sufficient. Needs Rs." + needs + " more");
	}

}
