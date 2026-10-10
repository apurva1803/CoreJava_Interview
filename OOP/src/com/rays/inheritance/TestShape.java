package com.rays.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.setLength(5);
		r.setWidth(10);
		r.setColor("Blue");
		r.setName("Rectangle");

		System.out.println(r.getLength());
		System.out.println(r.getColor());
		System.out.println(r.getName());
		System.out.println(r.getWidth());
		
		r.area();

	}
}
