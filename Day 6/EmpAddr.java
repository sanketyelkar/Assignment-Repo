package com.thinkitive;

public class EmpAddr implements Comparable<EmpAddr> {
	private String city;
	private int pin;

	public EmpAddr(String city, int pin) {
		this.city = city;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "[city=" + city + ", pin=" + pin + "]";
	}

	@Override
	public int compareTo(EmpAddr o) {
		return this.pin - o.pin;
	}

}
