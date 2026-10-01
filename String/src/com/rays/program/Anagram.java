package com.rays.program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="racei";
		String s2="cares";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
//		"racei" → ['r', 'a', 'c', 'e', 'i']
//		"cares" → ['c', 'a', 'r', 'e', 's']
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
//		ch1 → ['a', 'c', 'e', 'i', 'r']
//		ch2 → ['a', 'c', 'e', 'r', 's']
		
		if(Arrays.equals(ch1, ch2))	//checks arrays contain the same elements in the same order.
		{
		
			System.out.println("String is Anagram");
			
		}
		
		else {
			System.out.println("String is  not Anagram");
		}

	}
}

//Output:String is  not Anagram
	