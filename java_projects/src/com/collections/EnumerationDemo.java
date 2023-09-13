package com.collections;
import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<String> v =new Vector<>(); // vector object creation
		v.add("hello");
		v.add("ramu");
		v.add("Durga");
		v.add("Navya");
		System.out.println(v);
		
		Enumeration<String> e = v.elements();  // Enumeration forward direction methods
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Hashtable<String, Integer> ht = new Hashtable<>(); // HashMap object creation
		ht.put("hello",123);
		ht.put("ramu",234);
		ht.put("Durga",345);
		ht.put("Navya",456);
		System.out.println(ht);
			
		Enumeration<Integer> e1 = ht.elements(); // Enumeration forward direction methods
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}

	}

}
