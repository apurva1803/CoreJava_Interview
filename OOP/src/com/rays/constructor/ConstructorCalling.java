package com.rays.constructor;

public class ConstructorCalling {

	public String fName;
	public String lName;

	public ConstructorCalling() {
		
		System.out.println("first");
		
	}

	public ConstructorCalling(String fName) {
		this();
		
		System.out.println("second");
		
		this.fName = fName;
		System.out.println(fName);
	}

	public ConstructorCalling(String fName, String lName) {
		this(fName);
		
		System.out.println("third");
		
		this.lName = lName;
		System.out.println(lName);
	}
}

//Output:
//	first
//	second
//	Apurva
//	third
//	Deshmukh
