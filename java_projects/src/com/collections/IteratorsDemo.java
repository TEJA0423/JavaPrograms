package com.collections;

import java.util.*;

public class IteratorsDemo {

	public static void main(String[] args) {
		ArrayList<String> v =new ArrayList<>(); // ArrayList object creation
		v.add("hello");
		v.add("ramu");
		v.add("Durga");
		v.add("Navya");
		System.out.println(v);
		
		 Iterator<String> i = v.iterator();  //  Iterator forward direction methods
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();      // it removes the  last element in arrayList
		System.out.println(v);
		
		HashMap<String, Integer> ht = new HashMap<>(); // HashMap object creation
		ht.put("hello",123);
		ht.put("ramu",234);
		ht.put("Durga",345);
		ht.put("Navya",456);
	    System.out.println();
		
		ht.keySet().iterator();
		ht.values().iterator();
	    ht.entrySet().iterator();
	 	System.out.println(ht);

	}

}
