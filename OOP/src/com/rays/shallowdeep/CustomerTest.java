package com.rays.shallowdeep;

public class CustomerTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Original Customer object
		Customer cus = new Customer("Apurva");

		// Original BankAccountDetails object
		cus.acc = new BankAccountDetails();
		cus.acc.balance = 100;

		// Customer ka clone ban raha hai
		Customer cus1 = (Customer) cus.clone();

		cus1.acc.balance = 200;

		System.out.println(cus.name);
		System.out.println(cus.acc.balance);
		
		System.out.println("--------");

		// Cloned Customer ke account ka balance change

		System.out.println(cus1.name);
		System.out.println(cus1.acc.balance);
	}
}

//Output:
//	Apurva
//	200.0
//	--------
//	Apurva
//	200.0
