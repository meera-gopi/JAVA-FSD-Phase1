package com.session2.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Double> list = new LinkedList<>();
		
		list.add(10.00);
		list.add(30.00);
		list.add(44.00);
		list.add(31.00);
		list.add(30.00);
		list.add(40.00);
		
		System.out.println(list);
		
		for(double x:list)
			System.out.println(x);
	}

}
