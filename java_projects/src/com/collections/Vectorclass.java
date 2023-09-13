package com.collections;
import java.util.*;
public class Vectorclass {

	public static void main(String[] args) {
		int n = 5;
		Vector<Integer> v = new Vector<Integer>(n);
		for (int i = 1; i <= n; i++)
            v.add(i);
		System.out.println("Vector Array of : "+v);
		
		System.out.println("Remove of Vector : "+  v.remove(2)+" "+ v);
		
		// iterating over vector elements	
		for (int i = 0; i < v.size(); i++)
			 
        // Printing elements one by one
            System.out.print(v.get(i) + " ");

	}

}
