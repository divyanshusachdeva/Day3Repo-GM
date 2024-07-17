package com.graymatter;

public class Main {

	public static void main(String[] args) {

		ScientificCalculator sc = new ScientificCalculator();
		sc.pow(6, 3);
		
		ArithmeticCalculator ac = new ScientificCalculator();
		
		ac.pow(5, 2);
	
		
//		Shape s = new Shape();
//		s.getArea();
//		s.getPerimeter();
//		
//		Square sq = new Square(8);
//		sq.getArea();
//		sq.getPerimeter();
//		
//		Circle c = new Circle(7);
//		c.getArea();
//		c.getPerimeter();
//		
//		Shape s1 = new Square(6);
//		s1.getArea();
//		
//		s1 = new Circle(14);
//		s1.getArea();
		
	
		
//		CalculatorInterface ci = new MyCalculator();
//		
//		ci.add(8, 9);
//		ci.diff(15, 6);
//		
//		MyScientificCalculatorInterface msi = new MyCalculator();
//		msi.pow(4,5);
//			
//		MyCalculator mc = new MyCalculator();
//		mc.add(6, 8);
//		mc.pow(5, 3);
//	
		
//		MyClass mc = new MyClass();
//		mc.display();
//		
//		Interface1 i1 = mc;
//		i1.display();
//		
//		Interface1 i2 = mc;
//		i2.display();
//		
		
		CalculatorInterface.getDeveloperInfo();
		
//		CalculatorInterface ci = new MyCalculator();
//		mc.getDeveloperInfo();
		
//		Calling interface using an object is not possible.
		
	}
}
