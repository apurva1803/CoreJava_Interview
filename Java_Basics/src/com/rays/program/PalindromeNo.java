package com.rays.program;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int num1 = 1221;
		int num2 = num1;
		int temp = 0;
		int r = 0;

		while (num2 > 0) {
			
			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;
			
		}
			if (temp == num1) {
				System.out.println(num1 + " this is palidrome No ");
			} else {
				System.out.println(num1 + " this is  not palindrome No ");
			
		}
	}
}
