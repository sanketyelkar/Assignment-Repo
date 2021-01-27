package com.thinkitive;

import java.util.Comparator;

public class EmpEidComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
//		return o1.getEid() - o2.getEid();

		if (o1.getEid() > o2.getEid())
			return 1;
		else if (o1.getEid() < o2.getEid())
			return -1;
		else
			return 0;

	}
}
