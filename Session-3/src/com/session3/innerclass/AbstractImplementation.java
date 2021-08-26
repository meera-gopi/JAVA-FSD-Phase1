package com.session3.innerclass;


//Using anonymous inner class to implement method

public class AbstractImplementation {
	
	public static void main(String[] args) {
		
		AnonymousInnerclass a = new AnonymousInnerclass() {
			
			@Override
			void display() {
				// TODO Auto-generated method stub
				
				System.out.println("Implementation of Abstract class");
				
			}
		};
		
		a.display();
	}
	
	
}



/// Simple way of implementing 

//public class AbstractImplementation extends AnonymousInnerclass {
//	
//	
//	void display()
//	{
//		
//	System.out.println("Implementing Abstract Method");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		new AbstractImplementation().display();
//
//	}
//
//}
