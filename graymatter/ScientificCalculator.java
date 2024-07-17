package com.graymatter;

public class ScientificCalculator extends ArithmeticCalculator {

	

	@Override
	public void pow(int a, int b) {
		System.out.println(Math.pow(a, b));
		
	}

	public void squareRoot(int a) {
		System.out.println(Math.sqrt(a));
	}
	
}
