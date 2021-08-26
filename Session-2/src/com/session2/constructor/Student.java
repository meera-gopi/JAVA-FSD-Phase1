package com.session2.constructor;

public class Student {
	
	int rollNo;
	String name ;
	String address;
	static String college = "Great Lakes";//Use of static variable . All objects of class used this variable and its value
	
	//Default Constructor
	
	public Student()
	{
		System.out.println("This is default constructor and is initialized first");
	}
	
	//Parameterized Constructor
	
	public Student(int rollNo, String name, String address)
	{
		
		// Use of this keyword
		this.rollNo = rollNo;
		this.name = name;
		this.address= address;
	}
	
	public void display() {
		
		System.out.println("RollNo  :" + rollNo);
		System.out.println("Name  :" + name);
		System.out.println("Address : " +address);
		System.out.println("College  : " + college);
	}

}
