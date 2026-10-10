package com.rays.inheritance;

public class Shape {

	public String name;
	public String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void area() {
		System.out.println("Shape Area");
	}

}
