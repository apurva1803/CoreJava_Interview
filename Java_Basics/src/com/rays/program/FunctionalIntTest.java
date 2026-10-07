package com.rays.program;

public class FunctionalIntTest {

	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {

			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};

		int a = 20;
		int b = 10;
		
		System.out.println(f.sum(a, b));
		
		// interface name se call hoti vo static method hee
		FunctionalInt.sub(a, b);
		
		// interface object se call hoo vo default method hoti hee
		f.multi(a, b);
	}

}
