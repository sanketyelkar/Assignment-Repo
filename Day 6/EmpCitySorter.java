package com.thinkitive;

import java.util.Comparator;

//Remaining.....

public class EmpCitySorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAddr().getCity().compareTo(o2.getAddr().getCity());
	}

}
