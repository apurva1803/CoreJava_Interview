package com.rays.methodreturn;

public class TestShape {

	public static void calcArea(Shape[] s) {

		for (int i = 0; i < s.length; i++) {
			System.out.println("Area = " + s[i].area());
		}
	}

	public static void main(String[] args) {

		Shape s[] = new Shape[3];

		s[0] = Shape.getShape(1);

		s[1] = Shape.getShape(2);

		s[2] = Shape.getShape(3);

		// Method Argument Polymorphism
		calcArea(s);
	}
}

//Output:
//	Area Of Circle = 12.56
//	Area = 12.56
//	Area Of Triangle = 2.0
//	Area = 2.0
