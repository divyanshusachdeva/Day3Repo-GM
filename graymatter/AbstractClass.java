package com.graymatter;

public abstract class AbstractClass {

	private String name;
	
	public String printName(String name) {
		
		this.name = name;
		return this.name;
	
	}
	
	public abstract void sayHello();
//		System.out.println("Hello...");
	
}
