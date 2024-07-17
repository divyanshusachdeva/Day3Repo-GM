package com.graymatter;

public interface CalculatorInterface {

	public void add(int a, int b);
	public void diff(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
	public default void pow(int a, int b) {
		System.out.println("Calculator interface default value");
		
	}

	public default void squareRoot(int a) {
		System.out.println("Calculator interface default value");
	}
	
	public static void getDeveloperInfo() {
		System.out.println("Divyanshu");
	}
}
