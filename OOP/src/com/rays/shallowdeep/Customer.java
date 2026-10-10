package com.rays.shallowdeep;

public class Customer implements Cloneable {

	String name;
	BankAccountDetails acc;

	public Customer(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {

		// Customer ka object clone ho raha hai
		Customer c = (Customer) super.clone();

		// Customer ke andar jo BankAccountDetails object hai,
		// uska bhi alag object clone ho raha hai
		/*
		 * c.acc = (BankAccountDetails) acc.clone();
		 */
		return c;
	}
}
