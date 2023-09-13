package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cat");
		al.add("Dog");
		System.out.println("ArrayList Before Swap : "+ al);
		Collections.swap(al, 1, 2);
		System.out.println("ArrayList After Swap : "+ al);

	}

}
