package com.rays.shallowdeep;

public class Address2 implements Cloneable {

	public String city;

	public Address2() {
	}

	public Address2(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
