package com.thinkitive;

public class Test {
	private int funds;

	public int getFunds() {
		return funds;
	}

	public void addFunds(int amt) {
		this.funds = this.funds + amt;
		System.out.println("Successfully added Rs." + amt);
	}

	public void withdraw(int amt) throws InsufficientFundsException {
		if (amt <= this.funds) {
			this.funds -= amt;
			System.out.println("Succesfully Withdrawn Rs." + amt);
		} else {
			throw new InsufficientFundsException(amt - this.funds);
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.addFunds(1000);
		t.addFunds(2000);
		t.addFunds(200);

		int amt = 7000;
		try {
			t.withdraw(700);
			t.withdraw(250);
			t.withdraw(amt);
		} catch (InsufficientFundsException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Balance is Rs." + t.getFunds());

//		assert funds >= 5000 : "Not Enough Funds";
//
//		System.out.println("Enough Funds are there");

	}
}
