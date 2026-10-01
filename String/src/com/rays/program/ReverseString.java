package com.rays.program;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="Apurva Deshmukh";
		
		for(int i=s1.length()-1;i>=0;i--) {
		
			System.out.print(s1.charAt(i));
		}
		
	}
}

// Output: hkumhseD avrupA
