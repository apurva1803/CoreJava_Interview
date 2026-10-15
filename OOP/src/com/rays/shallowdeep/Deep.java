package com.rays.shallowdeep;

public class Deep implements Cloneable {

	public int balance;
	public Address2 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Deep d = (Deep) super.clone();

		// Address object ki bhi separate copy
		d.address = (Address2) address.clone();

		return d;
	}

}
