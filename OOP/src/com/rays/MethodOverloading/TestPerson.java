package com.rays.MethodOverloading;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.login("apurva@gmail.com ");
		
		p.login("apurva@gmail.com " , "Apurva123 ");
		
		p.login("apurva@gmail.com " , "Apurva123 ", "Apurva");

	}
}
