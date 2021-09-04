package com.generalstudy.oopsjavadatastructure;

public class InternalInvariantsExample1 {
	
	static void display(int x) {
		
		if(x>0)
		{
			System.out.println("X is greater than zero");
		}
		else
		{
			assert (x==0) ;
			//System.out.println();
			System.out.println("X is Negative");
		}
	}
	
	public static void main(String[] args) {
		
		//display(5);
		
		display(0);
		
		//display(-5);
		
	}

}
