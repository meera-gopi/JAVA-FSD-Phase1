package com.practiseproblems.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	private float first, second ; // First and second numbers for the calculation
		
	//Constructor to initialize variables with user entered values
	private ArithmeticCalculator(float first, float second) {
		super();
		this.first = first;
		this.second = second;
		
	}
	
	// Method definitions for Addition

    private void sum() {
    	
    	System.out.println(" Sum of the entered numbers is : "+ (first + second) );
    	
    }
    
    
    //Method definition for  Subtraction
    private void difference() {
    	
    	System.out.println(" Difference of the entered numbers is : "+(first-second) );
    	
    }
    
    
    //Method definition for Multiplication
    
    private void product() {
    	
    	System.out.println(" Product of the entered numbers is : "+ (first * second) );
    	
    }
    
    //Method definition for Division
    
    private void division() 
    {
    	
    	System.out.println(" Result of division is  : "+ first/second );
    	
    }
    
    

	public static void main(String[] args) {
		
		// Variables to store user entries
		float first_num;
		float second_num=0;
		Scanner  s  =  new Scanner(System.in);
		
	
		
		System.out.print(" Enter 1 for  Addition  \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division \n");
		
		System.out.print("\n Enter Selection : ");
		int operator = s.nextInt();
		
		if(operator < 4) {
			System.out.print(" Enter the First Number  : ");
			first_num = s.nextFloat();
			System.out.print(" Enter the Second Number  : ");
			second_num = s.nextFloat();}
		else 
		{
			System.out.print(" Enter the Numerator  : ");
			first_num = s.nextFloat();
			
			do {
			System.out.print(" Enter the Denominator  : ");
			second_num =  s.nextFloat();
			
			if (second_num == 0)
				System.out.println(" Divvision by zero is not permissible , please enter a valid denominator ");
			
			} while (second_num == 0);
		
		}
		
		// Arithmetic class object creation and function calling based on operator selection by user
		
		ArithmeticCalculator calc = new ArithmeticCalculator(first_num, second_num);
			
		switch (operator) {
		
		case 1:
			calc.sum();
			break;
		case 2:
			calc.difference();
			break;
		case 3:
			calc.product();
			break;
		case 4:
			calc.division();
			break;
		
		}
		
s.close();

	}

	
}
