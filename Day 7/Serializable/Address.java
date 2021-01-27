package com.thinkitive;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pincode;
	private String city;

	public Address() {

	}

	public Address(int pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return " [pincode=" + pincode + ", city=" + city + "]";
	}

}
