package com.rays.withoutconstructor;

public class Circle extends Shape {

	public static final double PI = 3.14;

	public double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double redius) {
		this.radius = redius;
	}

	@Override
	public double area() {
		double area = PI * radius * radius;
		return area;
	}

}
