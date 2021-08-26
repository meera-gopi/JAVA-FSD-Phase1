package com.session2.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Alex");
		map.put(2, "Miranda");
		map.put(3, "Lillian");
		map.put(null, null);
		map.put(null, null);
		map.put(5, null);
		
		System.out.println(map);
		
		System.out.println(map.entrySet());
		
		for(@SuppressWarnings("rawtypes") Map.Entry m :map.entrySet())
			System.out.println(m.getKey() +" "+m.getValue());
			

	}

}
