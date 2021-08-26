package com.session2.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(12);
		list.add(10);
		list.add(50);
		list.add(20);
		
		System.out.println(list);
		
		//enhanced for
		
		for(int x:list)
			System.out.println(x);
		
	
		
	}

}
