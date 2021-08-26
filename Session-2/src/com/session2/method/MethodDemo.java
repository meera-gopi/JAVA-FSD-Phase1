package com.session2.method;
import java.util.Scanner;

public class MethodDemo {
	
	Scanner sc = new Scanner(System.in);
	
	protected void print()
	{
		System.out.println("Hello World");
	}
	
	public int cube(int n)
	{
		int result = n*n*n;
		return result;
		
	}
	
	public static void work()
	{
		System.out.println("Welcome Everyone");
	}
	
	


}
