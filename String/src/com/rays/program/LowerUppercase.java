package com.rays.program;

public class LowerUppercase {

	public static void main(String[] args) {

		String str = "Sandeep";

		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if (i % 2 == 0) {
				
				//String s = String.valueOf(str.charAt(i));
				System.out.print(Character.toLowerCase(ch));
			}else {
				
				//String s1 = String.valueOf(str.charAt(i));
				System.out.print(Character.toUpperCase(ch));	
				
			}

		}
	}
}

//Output: sAnDeEp

//S → s   index 0 → lowercase
//a → A   index 1 → uppercase
//n → n   index 2 → lowercase
//d → D   index 3 → uppercase
//e → e   index 4 → lowercase
//e → E   index 5 → uppercase
//p → p   index 6 → lowercase
