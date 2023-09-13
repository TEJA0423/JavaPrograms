package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<>(new MyComparator2());
		t1.add("Ramu");
		t1.add("Roshu");
		t1.add("Kalyan");
		t1.add("Rajiv");
		t1.add("Shyam");
		t1.add("Radha");
		System.out.println(t1);
		
	}
}
class MyComparator2 implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		
	 return s2.compareTo(s1);  // Ascending Order
	 
//		return 0;
	}

}
