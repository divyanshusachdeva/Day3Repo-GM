package com.graymatter;

public class Circle extends Shape {

	double radius;
	public static final double pi = 3.14;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public void getArea() {
		System.out.println(pi * radius * radius);
	}
	
		public void getPerimeter() { 
			System.out.println(2 * pi * radius);
	}
}
