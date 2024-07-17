package com.graymatter;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class DemoOnStrings {
	
	public static void StartsWithS () {
		
    }
	
	

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println(str);
		System.out.println(str.hashCode());

		String s1 = new String("Hello");
		System.out.println(s1.hashCode());
		
		String s2 = "Hello";
		System.out.println(s2);		

		System.out.println(str.length());
		System.out.println(str.toUpperCase()); // To Upper
		System.out.println(str.toLowerCase()); // To Lower
		
		String s = s1;
		System.out.println(s.hashCode());
		
		
		s1 = s1 + "World";
		System.out.println(s1); // Concatenation
	
		System.out.println(s1.equals(s)); //Comparing 2 strings... s1 = HelloWorld and s = Hello
		
		
		s = "        Hello        ";
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.trim()); // Trimming extra spaces
		System.out.println(s.trim().length());
		
		
		System.out.println(str.charAt(1)); // Character at 2nd position
		
		System.out.println(str.replace('e', 'z')); // Replaces e with z
		
		System.out.println("a".compareTo("Z")); // As per dictionary order, it shows which string will come and what is the difference

		System.out.println(str.endsWith("lo")); // Checks if the 
		
		
		StringBuffer sbf = new StringBuffer();
		StringBuffer sbf1 = new StringBuffer();
		
		System.out.println(sbf.hashCode());
		System.out.println(sbf1.hashCode());
		
		sbf.append("Divyanshu");
		System.out.println(sbf);
		System.out.println(sbf.hashCode());
	
		System.out.println(sbf);
		System.out.println(sbf.hashCode());
		
		s = sbf.toString();
		System.out.println(s.hashCode());
		
		System.out.println(sbf.capacity()); // The capacity is 16 by default
		
		StringBuffer sbf2 = new StringBuffer(50);
		System.out.println(sbf2.capacity()); // Now the capacity will be 50
	
		
//		Display names starting with S.
		String[] names = {"Divyanshu", "Harshit", "Suhani", "Swapna", "Dhanya", "Harsha", "Amrit"};

        for (String nameS : names) {
            
            if (nameS.charAt(0) == 's' || nameS.charAt(0) == 'S') {
            
                System.out.println(nameS);
            }
        }
		
        
        String intro = "Hello my name is Divyanshu ";  // To split the string into array using the spaces in between
        String array[] = intro.split(" ");
        
        for(String sr : array)
        	System.out.println(sr);
        
        
       String joiner = "";  // To join the array of characters into a string using concatenation
       
       for (String sr : array)
    	   joiner = joiner + sr + " ";
       System.out.println(joiner);
       
        
       StringTokenizer tokenizer = new StringTokenizer(intro, " ");  // Even these 3 lines splits a string to array of words
       
       while(tokenizer.hasMoreTokens())
    	   System.out.println(tokenizer.nextToken());
       
       
       System.out.println("Joiner function: \n");
       StringJoiner sjoiner = new StringJoiner(",");
       sjoiner.add("apple");
       sjoiner.add("ball");
       sjoiner.add("world");
       System.out.println(sjoiner.toString());
       
       
       
       
        
        
        
        
        
	
	}
	
}
