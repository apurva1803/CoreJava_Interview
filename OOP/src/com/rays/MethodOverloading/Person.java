package com.rays.MethodOverloading;

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
