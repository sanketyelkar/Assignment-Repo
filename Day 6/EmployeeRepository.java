package com.thinkitive;

import java.util.List;
import java.util.ArrayList;

public class EmployeeRepository {
	private List<Employee> l = new ArrayList<>();

	public EmployeeRepository() {
		
	}
	
	public void addEmp(Employee e) {
		l.add(e);
	}
	
	public void updateEmp(Employee old, Employee newer) {
		l.set(l.indexOf(old), newer);
	}
	
	public void deleteEmp(int eid) {
		Employee emp = null;
		for(Employee e : l)
			if(e.getEid() == eid) {
				emp = e;
				break;
			}
		l.remove(emp);
	}
	
	public void getAllEmp() {
		for(Employee e : l)
			System.out.println(e);
	}
	
	public void getEmp(int eid) {
		Employee emp = null;
		for(Employee e : l)
			if(e.getEid() == eid) {
				emp = e;
				break;
			}
		System.out.println(emp);
	}

}
