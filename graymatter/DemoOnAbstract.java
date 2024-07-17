package com.graymatter;

public class DemoOnAbstract {

	public static void main(String[] args) {
		
		AbstractChildClass ac = new AbstractChildClass();
		
		ac.sayHello();
		System.out.println(ac.printName("Divyanshu"));

	}

}
