package com.thinkitive;

public class Factorial {
	public int factOf(int num) {
		int res = 1;
		while(num > 1)
			res *= num--;
		return res;
	}
}
