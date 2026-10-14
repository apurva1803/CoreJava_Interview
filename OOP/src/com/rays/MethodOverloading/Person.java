package com.rays.MethodOverloading;

//Method overloading is an example of compile-time polymorphism
//because the compiler determines which overloaded method to call

public class Person {

	public void login(String loginId) {
		System.out.println(loginId);
	}

	public void login(String loginId, String password) {
		System.out.println(loginId + password);
	}

	public void login(String loginId, String password, String name) {
		System.out.println(loginId + password + name);
	}
}
