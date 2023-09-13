package com.collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet<StringBuffer> t1 = new TreeSet<>(new MyComparator3());
		t1.add(new StringBuffer("R"));
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("K"));
		t1.add(new StringBuffer("C"));
		t1.add(new StringBuffer("S"));
		t1.add(new StringBuffer("B"));
		System.out.println(t1);
		
	}
}
class MyComparator3 implements Comparator<Object> 
{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
	String s1 = obj1.toString();
	String s2 = obj2.toString();
	return s2.compareTo(s1);  // Ascending Order	 
//		return 0;
	}
}