package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<>(new MyComparator1());
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(5);
		t1.add(20);
		t1.add(20);
		System.out.println(t1);
		
	}
}
class MyComparator1 implements Comparator<Integer>{
	
	public int compare(Integer i1, Integer i2) {
//		 return i1.compareTo(i2);   // Ascending Order
//		 return -i1.compareTo(i2);  // Descending Order
//	     return i2.compareTo(i1);   // Descending Order
//		 return -i2.compareTo(i1);  // Ascending Order
//		return 1;
//		return -1;
		return 0;
				
	}	
}
