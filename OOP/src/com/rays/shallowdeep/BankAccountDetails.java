package com.rays.shallowdeep;

public class BankAccountDetails implements Cloneable {

	double balance;

	// BankAccountDetails ka object clone ho raha hai
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
