package com.rays.methods;

public class Split {
	
	public static void main(String[] args) {
		
		String s1="Apurva Shivam Deshmukh";

		String arr[]= s1.split(" ");

		System.out.println(s1);

		System.out.println("--------------------------");
		
		for(String y:arr) {
			System.out.println(y);
		}
	}
}

//Output:
//	Apurva Shivam Deshmukh
//	--------------------------
//	Apurva
//	Shivam
//	Deshmukh
