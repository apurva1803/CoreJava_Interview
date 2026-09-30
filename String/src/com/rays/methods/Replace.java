package com.rays.methods;

public class Replace {

	public static void main(String[] args) {
		
		String s1="Apurva";
		
		System.out.println(s1);
		
		String s2=s1.replace("u","i");
		
		System.out.println("Replace u with i: "+ s2);
		
		System.out.println("------------");
		
		System.out.println(s1.replaceAll("Apurva", "Shruti"));
		
		System.out.println(s1);
		
//		Output:
//		Apurva
//		Replace u with i: Apirva
//		------------
//		Shruti
//		Apurva
	
	}
}
