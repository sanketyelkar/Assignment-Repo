package com.thinkitive;

public class Employee /* implements Comparable<Employee> */ {
	private int eid;
	private String name;
	private int salary;
	private EmpAddr addr;

	public Employee(int eid, String name, int salary, EmpAddr adr) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.addr = adr;
	}

	public EmpAddr getAddr() {
		return addr;
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " [eid=" + eid + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
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

//	@Override
//	public int compareTo(Employee o) {
////		return this.eid - o.eid;
//
//		if (this.eid > o.eid)
//			return 1;
//		else if (this.eid < o.eid)
//			return -1;
//		else
//			return 0;
//	}

}
