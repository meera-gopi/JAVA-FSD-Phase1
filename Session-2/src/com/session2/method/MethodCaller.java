package com.session2.method;

public class MethodCaller {

	public static void main(String[] args) {
		
		//MethodDemo
		
		MethodDemo obj = new MethodDemo();
		
		obj.print();
		
		int output = obj.cube(5);
		
		System.out.println("The cube of 5 is "+ output);
		
		System.out.println("The cube of 6 is " + obj.cube(6));
		
		MethodDemo.work();
		
		//MethodExecution
		
		MethodExecution obj1 = new MethodExecution();
		
		int mul = obj1.multiply(4, 5);
		
		System.out.println("The product of entered numbers is = "+mul);
		
		//MethodOverload
		
		MethodOverload obj2 = new MethodOverload();
		
		obj2.area(50, 25);
		obj2.area(12.5f);
		obj2.area(12);
		
		
	}
}
