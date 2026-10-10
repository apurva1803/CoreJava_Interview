package com.rays.MethodOverloading;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		
		p.login("apurvaraut9@gmail.com ");
		
		p.login("apurvaraut9@gmail.com " , "Apurva123 ");
		
		p.login("apurvaraut9@gmail.com " , "Apurva123 ", "Apurva");

	}
}
