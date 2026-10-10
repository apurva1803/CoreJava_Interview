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
		
		
		//runtime polymorphism(upcasting)
		//The Rectangle object is referenced by a Shape variable.
		Shape r1 = new Rectangle();
		
		System.out.println("Area Of Rectangle: "+r1.area());
		
		System.out.println("-----------------------------");

		
		//downcasting	
		//(Rectangle) r1 converts the reference to type Rectangle.
		Rectangle r2 = (Rectangle) r1;

		r2.setLength(10);
		r2.setWidth(20);
		System.out.println("Area Of Rectangle: "+r2.area());

	}
}
