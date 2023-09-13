package com.collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args)
	{
		// list of names
		List<Object> L = new LinkedList<>();
		L.add("Hello");
	    L.add(20);
		L.add("Welcome");
		L.add(null);
		System.out.println(L);

		// Getting ListIterator
		 ListIterator<Object> Iterator = L.listIterator();

		System.out.println("Forward  Iteration:");	
		while (Iterator.hasNext()) {  
			int index = Iterator.nextIndex();
			Object element =  Iterator.next();
			System.out.println( "Index : "+index+",Element : "+element);
		}
		System.out.println("Backward Iteration:");
		
		while (Iterator.hasPrevious()) {
			int index = Iterator.previousIndex();
			Object element =  Iterator.previous();
			System.out.println( "Index : "+index+",Element : "+element);
		}
		Iterator = L.listIterator();
		
		// Set an Element using set() method
		Iterator.next();
		Iterator.set("Vtalent");
		Iterator.add("World");
//		Iterator.next();
//		Iterator.remove();
		
		for(Object Objects: L) {
			System.out.println("Object: "+ Objects);
		}
	}
}
