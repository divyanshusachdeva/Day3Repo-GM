package com.graymatter;

public class DemoOnFunctionalInterface implements MyFunctionalInterface{

	public static void main(String[] args) {
		
		DemoOnFunctionalInterface dof = new DemoOnFunctionalInterface();
	    System.out.println(dof.cubeOfNum(5));
	    
	    MyFunctionalInterface mfi = dof;
	    System.out.println(mfi.cubeOfNum(4));
		
	}
	
	public int cubeOfNum(int num) {
		
		return num * num * num;
		
	}
	
}
