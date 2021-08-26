package com.session3.innerclass;

public class MethodLocalInnerclass {
	
	//Creating a class inside a method , but object can only be created inside the method only
	
	private String msg = " Welcome to the world";
	
		private void display() {
		
		class Inner {
			
			void message () {
				
				System.out.println(msg);
			}
			
			
		}//inner class ends
		
		
		Inner innerobj = new Inner();
		
		innerobj.message();
		
		
	}//method ends

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodLocalInnerclass obj = new MethodLocalInnerclass();
		
		obj.display();
		
		

	}

}
