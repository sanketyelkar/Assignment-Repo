package com.thinkitive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {

		EmpAddr ad1 = new EmpAddr("Dombivli",421202);
		EmpAddr ad2 = new EmpAddr("Mumbai",343434);
		EmpAddr ad3 = new EmpAddr("Pune",3433);
		EmpAddr ad4 = new EmpAddr("Goa",24324);
	
		
		Employee e1 = new Employee(1, "abc", 210000, ad1);
		Employee e2 = new Employee(2, "ghj", 54000, ad2);
		Employee e3 = new Employee(3, "lmn", 670000, ad3);
		Employee e4 = new Employee(4, "xyz", 420000, ad4);

		List<Employee> l = new ArrayList<>();
		l.add(e3);
		l.add(e4);
		l.add(e1);
		l.add(e2);

		EmpEidComparator eidSort = new EmpEidComparator();
		EmpSalaryComparator salarySort = new EmpSalaryComparator();
		EmpNameComparator nameSort = new EmpNameComparator();
		EmpCitySorter citySort = new EmpCitySorter();
		EmpPinSorter pinSort = new EmpPinSorter();

		Collections.sort(l, citySort);

//		for (Employee e : l)
//			System.out.println(e);
		
		Iterator<Employee> i = l.iterator(); //this has less functionalities though.
		
		
		ListIterator<Employee> empItr = l.listIterator();
		while(empItr.hasNext())
			System.out.println(empItr.next());
		
		System.out.println();
		
		while(empItr.hasPrevious())
			System.out.println(empItr.previous());

	}
}
