package com.session2.method;

public class MethodOverload {
	
	public void area(int b, int h)
	
	{
		System.out.println("Area of the triangle is " +  (b*h/2));
	}
	
	public void area(float r)
	{
		System.out.println("Area of the circle is : " + (3.14*r*r));
	}
	
	public void area(int r)
	{
		System.out.println("Area of the square is : " + (r*r));
	}
	
	

}
