package com.graymatter;

public class MyCalculator implements CalculatorInterface, MyScientificCalculatorInterface{
	//multiple inheritence is achieved using interfaces

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	@Override
	public void diff(int a, int b) {
		System.out.println(a - b);

	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a * b);

	}

	@Override
	public void div(int a, int b) {
		System.out.println(a / b);

	}

	@Override
	public void pow(int a, int b) {
		System.out.println(Math.pow(a, b));

	}

	@Override
	public void squareRoot(int a) {
		System.out.println(Math.sqrt(a));
		
	}

}
