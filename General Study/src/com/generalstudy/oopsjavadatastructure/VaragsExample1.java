package com.generalstudy.oopsjavadatastructure;

public class VaragsExample1 {
	
	static void display(String... values) {
		System.out.println("Input variable length" +" =  " + values.length);
		for(String x: values)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();
		
		display("Learn","Varags","Easy");
	}

}
