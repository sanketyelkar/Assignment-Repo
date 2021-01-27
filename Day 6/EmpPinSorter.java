package com.thinkitive;

import java.util.Comparator;

public class EmpPinSorter implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAddr().getPin() - o2.getAddr().getPin();
	}

}
