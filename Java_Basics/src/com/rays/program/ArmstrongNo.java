package com.rays.program;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		int num1 = 153;
		int num2=num1;
		int temp=0;
		int r=0;
		
		while(num2>0) {
			
			r = num2%10;
			temp = temp + r * r * r;
			num2 = num2/10;
			
		}
		
		if (temp == num1) {
			System.out.println(num1 + " Is Armstrong Number");
		} else {
			System.out.println(num1 + " Is Not Armstrong Number");
		}
		
	}
}
