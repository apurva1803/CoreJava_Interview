package com.rays.shallowdeep;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException {

		Deep d1 = new Deep();

		d1.balance = 10;

		d1.address = new Address2();
		d1.address.city = "Indore";
		
		System.out.println(d1.balance);
		System.out.println(d1.address.city);
		
		System.out.println("-------------");
		

		// Deep Clone
		Deep d2 = (Deep) d1.clone();

		// Primitive value change
		d2.balance = 20;

		// Nested object value change
		d2.address.city = "Mumbai";

		System.out.println(d2.balance);
		System.out.println(d2.address.city);
	}
}

//Output:
//	10
//	Indore
//	-------------
//	20
//	Mumbai
