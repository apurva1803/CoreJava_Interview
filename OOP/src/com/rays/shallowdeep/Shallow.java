package com.rays.shallowdeep;

public class Shallow implements Cloneable {

	public int balance;

	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
