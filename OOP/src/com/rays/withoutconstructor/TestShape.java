package com.rays.withoutconstructor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[1];

		s[0] = new Circle();

		Circle c = (Circle) s[0];

		c.setRadius(2);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}
	}

}

//Output:
//	12.56
