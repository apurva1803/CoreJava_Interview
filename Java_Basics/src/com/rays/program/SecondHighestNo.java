package com.rays.program;

public class SecondHighestNo {

	public static void main(String[] args) {

		int[] num = { 100, 52, 32, 42, 52, 24, 43, 53 };

		int first = 0;
		int second = 0;

		for (int i = 0; i < num.length; i++) {

			if (first < num[i]) {
				
				second = first;
				
				first = num[i];
				
			} else if (num[i] > second && num[i] < first) {
				
				second = num[i];

			}

		}
		System.out.println(second);
	}

}
