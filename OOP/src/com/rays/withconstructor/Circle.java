package com.rays.withconstructor;

public class Circle extends Shape {

	public int radius;

	public static final double PI = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("Area of Circle:");
		return PI * radius * radius;
	}

}
