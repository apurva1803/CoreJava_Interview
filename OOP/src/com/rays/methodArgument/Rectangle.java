package com.rays.methodArgument;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {

		double area = length * width;
		System.out.println("Area Of Rectangle = " + area);
		return area;

	}
}
