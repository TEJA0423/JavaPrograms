package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args)
	{
		// list of names
		List<Object> L = new ArrayList<>();
		L.add("Roshu");
	    L.add("Raju");
		L.add("Ballayya");
		L.add("Teja");
		System.out.println(L);

		// Getting ListIterator
		 ListIterator<Object> Iterator = L.listIterator();

		System.out.println("Forward  Iteration:");	
		while (Iterator.hasNext()) {  
			int index = Iterator.nextIndex();
			Object names =  Iterator.next();
			System.out.println( "Index : "+index+",Element : "+names);
		}
		System.out.println("Backward Iteration:");
		
		while (Iterator.hasPrevious()) {
			int index = Iterator.previousIndex();
			Object names =  Iterator.previous();
			System.out.println( "Index : "+index+",Element : "+names);
		}
		Iterator = L.listIterator();
		
		// Set an Element using set() method
		Iterator.next();
		Iterator.set("Ram");
		Iterator.add("Kalyan");
		Iterator.next();
		Iterator.remove();
		
		for(Object names: L) {
			System.out.println("names: "+ names);
		}
	}
}


