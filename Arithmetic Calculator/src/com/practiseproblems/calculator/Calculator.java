package com.practiseproblems.calculator;
import java.util.Scanner;

public class Calculator {
	
	public float first,second,numerator,denominator,result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubC
		
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter 1 for  Addition  \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division");
		
		System.out.print("\n Enter Selection : ");
		int operator = scanner.nextInt();
		
		if(operator < 4) {
			System.out.print(" Enter the First Number  : ");
			calc.first = scanner.nextFloat();
			System.out.print(" Enter the Second Number  : ");
			calc.second = scanner.nextFloat();}
		else 
		{
			System.out.print(" Enter the Numerator  : ");
			calc.numerator = scanner.nextFloat();
			System.out.print(" Enter the Denominator  : ");
			calc.denominator = scanner.nextFloat();}
			
		
		
		switch (operator) {
		
		case 1:
			calc.result = calc.first + calc.second;
			System.out.println(" The sum is : "+ calc.result);
			break;
		case 2:
			calc.result = calc.first - calc.second;
			System.out.println(" The difference is : "+ calc.result);
			break;
		case 3:
			calc.result = calc.first * calc.second;
			System.out.println(" The product is : "+ calc.result);
			break;
		case 4:
			if(calc.denominator == 0) 
				System.out.println("Division by zero error");
				
			else 
				{calc.result = calc.numerator/calc.denominator;
				System.out.println(" The result is : "+ calc.result);}
			break;
		
		}
				
	scanner.close();	

	}

}
