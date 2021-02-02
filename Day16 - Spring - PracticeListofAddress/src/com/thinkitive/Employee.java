package com.thinkitive;

import java.util.List;


public class Employee {
	private int eid;
	private String ename;
	private int salary;
	private List<Address> addr;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Address> getAddr() {
		return addr;
	}

	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
	}

}
