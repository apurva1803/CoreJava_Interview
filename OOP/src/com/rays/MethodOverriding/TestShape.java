package com.rays.MethodOverriding;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setLength(10);
		r.setWidth(20);

		System.out.println("Area Of Rectangle: "+r.area());
		
		System.out.println("-----------------------------");

		Triangle t = new Triangle();

		t.setBase(20);
		t.setHeight(30);

		System.out.println("Area Of Triangle: "+t.area());
		
		System.out.println("-----------------------------");
		
		
		//runtime polymorphism(upcasting):assigning a child-class object to a parent-class reference.
		
		//The Rectangle object is referenced by a Shape variable.
		
		Shape r1 = new Rectangle();
		
		System.out.println("Area Of Rectangle: "+r1.area());
		
		System.out.println("-----------------------------");

		
		//downcasting : converting a parent-class reference back to a child-class reference.
		
		//(Rectangle) r1 converts the reference to type Rectangle.
		
		Rectangle r2 = (Rectangle) r1;

		r2.setLength(10);
		r2.setWidth(20);
		System.out.println("Area Of Rectangle: "+r2.area());

	}
}

//Output:
//	Rectangle Area Method
//	Area Of Rectangle: 200.0
//	-----------------------------
//	Area Of Triangle: 300.0
//	-----------------------------
//	Rectangle Area Method
//	Area Of Rectangle: 0.0
//	-----------------------------
//	Rectangle Area Method
//	Area Of Rectangle: 200.0
