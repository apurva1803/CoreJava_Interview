package com.rays.shallowdeep;

public class Deep implements Cloneable {

	public int balance;
	public Address2 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Deep deep = (Deep) super.clone();

		// Address object ki bhi separate copy
		deep.address = (Address2) address.clone();

		return deep;
	}

}
