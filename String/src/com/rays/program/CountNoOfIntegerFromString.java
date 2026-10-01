package com.rays.program;

public class CountNoOfIntegerFromString {

	public static void main(String[] args) {
		
		String s = "Apurva7774897575";
		int count=0;
		
		for(int i=0;i<s.length();i++) //s.length() gives the total number of characters.
		{
			
			char ch=s.charAt(i);	//charAt(i) returns the character at index i.
		
			if(Character.isDigit(ch)) //Character.isDigit(ch) returns: true → if ch is a digit, false → if ch is not a digit
			{
				count++;
	
			}
		
		}
	
		if(count>0) {
			System.out.print(" count= " +count);
		}
			

	}
}

//Output:
//	 count= 10
