package com.collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		TreeSet<Object> t1 = new TreeSet<>(new MyComparator4());
		t1.add(10);
		t1.add("Ramu");
		t1.add(new StringBuffer("K"));
		t1.add(new StringBuffer("C"));
		t1.add("Hello");
		t1.add("Roshu");
		System.out.println(t1);
		
	}
}
class MyComparator4 implements Comparator<Object> 
{
	
	@Override
	public int compare(Object obj1, Object obj2) {	
	String s1 = obj1.toString();
	String s2 = obj2.toString();
	int i1= s1.length();
	int i2= s2.length();
	if(i1<i2) {
		return -1;		
	}
	else if(i1>i2) {
		return 1;
	}else {
		return s1.compareTo(s2);
	}
}
}
