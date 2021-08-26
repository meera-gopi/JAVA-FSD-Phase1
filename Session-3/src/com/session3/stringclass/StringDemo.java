package com.session3.stringclass;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String ("Hello");
		
		System.out.println("Length of String s1 = " + s1.length());
		
		String s2 = "Gello";
		
		System.out.println(s1==s2);// this only compares values stored in stack therefore false
		
		System.out.println("Compare strings  "+ s1.compareTo(s2));//take ascii difference of each characters
		
		//Substring
		
		String sub = "Welcome";
		
		System.out.println(sub.substring(3,6));
		
		// Check if string empty
		
		String s3 = "";
		
		System.out.println("Check if empty  " + s3.isEmpty());
		
		// Upper case
		
		System.out.println("To upper case "+ s1.toUpperCase());
		System.out.println("To lower case "+ s2.toLowerCase());
		
		String s4 = "          The spaced             ";
		System.out.println( s4.length());
		String s5=s4.trim();
		
		System.out.println(s5.length());
		
		// Replace
		
		String s6 = "Welcome to the Universe";
		
		System.out.println(s6);
		
		System.out.println("Replacing Universe with world");
					
		String replace = s6.replace("Welcome", "Greetings");
		System.out.println(replace);
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
