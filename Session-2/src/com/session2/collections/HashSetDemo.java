package com.session2.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(22);
		set.add(30);
		set.add(12);
		set.add(60);
		
		System.out.println("HashSet");
		
		System.out.println(set);
		
		for(int x:set)
			System.out.println(x);
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(12);
		set1.add(22);
		set1.add(30);
		set1.add(12);
		set1.add(60);
		
		System.out.println("LinkedHashSet");
		
		System.out.println(set1);
		
		
		
		
		for(int x:set1)
			System.out.println(x);
		
		
		
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(12);
		set2.add(22);
		set2.add(30);
		set2.add(12);
		
		set2.add(60);
		set2.add(10);
		
		System.out.println("TreeSet");
		
		System.out.println(set2);
		
		for(int x:set2)
			System.out.println(x);




	}

}
