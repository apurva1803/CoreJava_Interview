package com.rays.shallowdeep;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Deep deep1 = new Deep();

		deep1.balance = 10;

		deep1.address = new Address2();
		deep1.address.city = "Indore";

		// Deep Clone
		Deep deep2 = (Deep) deep1.clone();

		// Primitive value change
		deep2.balance = 20;

		// Nested object value change
		deep2.address.city = "Mumbai";

		System.out.println(deep1.balance);
		System.out.println(deep1.address.city);
		
		System.out.println("-------------");
		
		System.out.println(deep2.balance);
		System.out.println(deep2.address.city);
	}
}

//Output:
//	10
//	Indore
//	-------------
//	20
//	Mumbai
