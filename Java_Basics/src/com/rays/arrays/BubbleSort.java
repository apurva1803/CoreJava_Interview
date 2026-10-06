package com.rays.arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 66, 51, 40, 88, 35, 67, 21 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.print(arr[i]+" ");
		}
	}
}
