package com.collections;

import java.util.*;
public class AbstractListDemo {

	public static void main(String[] args) {
		AbstractList<Object> AL = new LinkedList<Object>();
		
		AL.add("Hello");
		AL.add("World");
		AL.add(25);
		AL.add(3.14);
		AL.add(null);
		System.out.println("AbstractList : " + AL);
		AL.remove(4);
		System.out.println("After Removing : " + AL);
		AL.set(1, "Hai..!");
		AL.add(2,"World");
		System.out.println("After Replace and Add print : " + AL);
		
	}

}
