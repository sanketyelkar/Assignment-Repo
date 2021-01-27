package com.thinkitive;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eid;
	private String ename;
	transient private int salary;
	private Address address;

	public Employee() {

	}

	public Employee(int eid, String ename, int salary, Address address) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

	public void doSerialize() {
		try {
			FileOutputStream fos = new FileOutputStream("emp.serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public Employee doDeserialize() {
		Employee emp = null;
		try {
			FileInputStream fis = new FileInputStream("emp.serial");
			ObjectInputStream ois = new ObjectInputStream(fis);

			emp = (Employee) ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return emp;
	}

}
