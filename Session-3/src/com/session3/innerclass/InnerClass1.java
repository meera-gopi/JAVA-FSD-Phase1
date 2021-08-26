package com.session3.innerclass;

public class InnerClass1 {
	
	private String msg = "Welcome to the world of innerclass";
	
	private int getCube(int x) {
		
		return x*x*x;
	}
	
	class Inner{
		
		void hello() {
			System.out.println(msg);
			
			System.out.println(getCube(5));
		}
		
		void hello(String message) {
			
			System.out.println(message);
		}
	
	}
	
	
	public static void main(String[] args) {
		
		InnerClass1 obj = new InnerClass1();
		
		InnerClass1.Inner inner = obj. new Inner();
		
		inner.hello();
		
		inner.hello("This is useful");
		
	}

}
