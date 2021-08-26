package com.session3.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SingleDimensional Array
		
		int a[] = {10,20,30,40,50,60};
		
		System.out.println("Length of the array"+" = "+a.length);//Length is a property thats why not having the bracket
		
		System.out.println("Element on index 3 : "+a[3]);
		
		for(int x:a)
			System.out.println(x);
		
		for (int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
		//Creating array object using new
		
		String b[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<b.length;i++){
		
		System.out.println("Enter Name : ");
		b[i] = sc.next();}
		
		System.out.println("The Arrays is ");
		
		for (String elem : b)
			System.out.println(elem);
		
		
			

	}}


