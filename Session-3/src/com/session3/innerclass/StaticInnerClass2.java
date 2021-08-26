package com.session3.innerclass;

public class StaticInnerClass2 {
	
	private static String msg = "Welcome to the world of innerclass";
	
	static class Inner{
		
		void hello() {
			System.out.println(msg);
		}
		
		
	
	}
	
	
	public static void main(String[] args) {
		
		StaticInnerClass2.Inner inner =  new StaticInnerClass2.Inner();
		
		inner.hello();
		
		
	}

}
