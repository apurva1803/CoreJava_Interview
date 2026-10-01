package com.rays.program;

public class PalindromeInbuild {

	public static void main(String[] args) {
		
		String s="madam";
		
		System.out.println("String: "+s);
		
		String value=new StringBuffer(s).reverse().toString();
		
		System.out.println("Reverse String: "+value);
		
		if(value.equals(s)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}
}

//Output:
//	String: madam
//	Reverse String: madam
//	palindrome
