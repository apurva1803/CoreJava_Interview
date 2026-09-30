package com.rays.methods;

public class Basics {
	
	public static void main(String[] args) {
			
		//concat
		String s1="Apurva";
		String s2="Deshmukh";
		System.out.println("Concat String:\n"+ s1.concat(" ").concat(s2));
		
		System.out.println("=====================================");
		
		//substring
		String s3="Apurva Deshmukh";
		System.out.println("SubString:\n"+s3.substring(7));
		
		System.out.println("=====================================");
		
		//character count
		
		System.out.println("Character Count:\n"+s3.length());
		
		System.out.println("=====================================");
		
		String s4=" Apurva Deshmukh ";
		
		System.out.println("String:\n"+s4);
		System.out.println("\nTrim String:\n"+s4.trim());
		
		System.out.println("=====================================");
		
		String y1="hello";
		String y2="HELLO";
		System.out.println(y1.equalsIgnoreCase(y2));
		
//		Output:Concat String:
//			Apurva Deshmukh
//			=====================================
//			SubString:
//			Deshmukh
//			=====================================
//			Character Count:
//			15
//			=====================================
//			String:
//			 Apurva Deshmukh 
//
//			Trim String:
//			Apurva Deshmukh
//			=====================================
//			true

	}
}
