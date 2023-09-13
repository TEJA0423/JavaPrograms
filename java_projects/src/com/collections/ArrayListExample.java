package com.collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		int n=8;
		
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println("ArrayList : "+l);
		
		for(int i=1;i<=n;i++) {
			l.add(i);
		}
		System.out.println("ArrayList : "+ l);
			
	}

}
