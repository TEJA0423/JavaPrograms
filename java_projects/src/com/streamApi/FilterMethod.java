package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethod {

	public static void main(String[] args) {
		
//// Creating a stream of strings
//		
//        Stream<String> stream = Stream.of(
//        		"Ram", "Gayathri", "DURGA", "Kalyan");
//        
//// using Stream filter(Predicate predicate)
//        
//        stream
//        .filter( str -> Character.isUpperCase(str.charAt(1)))
//        .forEach(System.out::println);

//		 // Creating a list of Integers
//        List<Integer> list = Arrays.asList(3, 4, 6, 12, 15, 20, 25);
//  
//       
//        // Using Stream filter(Predicate predicate)
//        list.stream()
//            .filter(num -> num % 5 == 0)
//            .forEach(System.out::println);
        
        // Creating a stream of strings
        Stream<String> stream = Stream.of( "Bhimavaram", "Rajhmandri", "Eluru", "vizag");
  
        // using Stream filter(Predicate predicate)
        stream.filter(str -> str.endsWith("u")).forEach(System.out::println);
	}

}
