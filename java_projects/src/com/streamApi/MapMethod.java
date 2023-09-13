package com.streamApi;

import java.util.*;

public class MapMethod {

	public static void main(String[] args) {
		List<String> countryNames = Arrays.asList("India","Japan","Australia","Russia");
		
		countryNames.stream()
		.map(name -> name.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println();
		
	// find the length of the list using map()
		countryNames.stream()
		.map(name -> name.length())
		.forEach(System.out::println);
		
		System.out.println();
		
	// multiple each element in list * 3 using map()	
		 List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
		    list.stream()
		    .map(number -> number * 3)
		    .forEach(System.out::println);
		
		    System.out.println();
		    
   // Divided by 5 in list elements using map()
		    List<Integer> list1 = Arrays.asList(4, 6, 10, 12, 15); 
		    list1.stream()
		    .map(num -> num % 5 == 0)
		    .forEach(System.out::println);
		    
	}

}
