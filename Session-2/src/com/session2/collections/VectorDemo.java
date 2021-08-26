package com.session2.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vector = new Vector<> ();
		
		vector.add(20);
		vector.add(40);
		vector.add(30);
		vector.add(20);
		
		System.out.println(vector);
		
		// to remove a value
		
		vector.remove(2);
		
		System.out.println("After removing position 2 " + vector);
		
		// Inserting a value
		
		vector.add(1,44);
		
		System.out.println("After inserting value at 1 " + vector);
		
		System.out.println(vector.size());

	}

}
