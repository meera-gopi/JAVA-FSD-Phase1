package com.session2.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<Integer,String> table = new Hashtable<>();
		table.put(1, "Joseph");
		table.put(2, "Mary");
		table.put(3, "Lillian");
//		table.put(null, null);
//		table.put(null, null);
//		table.put(5, null);
		
		System.out.println(table);
		
		for(Map.Entry m1 :table.entrySet())
			System.out.println(m1.getKey()+" "+m1.getValue());
		
		System.out.println("Tree Map");
		
		Hashtable<Integer,String> table1 = new Hashtable<>();
		table1.put(1, "Joseph");
		table1.put(2, "Mary");
		table1.put(3, "Lillian");
//		table.put(null, null);
//		table.put(null, null);
//		table.put(5, null);
		
		System.out.println(table1);
		
		for(Map.Entry m1 :table1.entrySet())
			System.out.println(m1.getKey()+" "+m1.getValue());
		

	}

}
