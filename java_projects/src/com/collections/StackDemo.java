package com.collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
//	Stack<Integer> s = new Stack<>();
//		s.push(15);
//		s.push(5);
//		s.push(9);
//		s.push(4);
//		s.push(10);
//	
//		System.out.println(s);
//		System.out.println("Size of stack : "+s.pop());
	
		 Stack<String> t1 = new Stack<>();
		t1.add("Ramu");
		t1.add("Roshu");
		t1.add("Kalyan");
		t1.add("Rajiv");
		t1.add("Shyam");
		t1.add("Radha");
		System.out.println(t1.pop());
		System.out.println(t1.peek());
		System.out.println(t1.push("sitha"));
		System.out.println(t1);
		System.out.println(t1.contains("sitha"));
		System.out.println();
		System.out.println(t1.isEmpty());
		System.out.println(t1.empty());
	}

	

}
