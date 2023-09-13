package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapFilter {

	public static void main(String[] args) {
		
       List<String> names = Arrays.asList("Ramu","Ravi","Geetha","Gayathri","teju","Kalyani");
		
		names.stream()
		.filter(str -> str.endsWith("i"))
		.map(name -> name.length())  
		.forEach(System.out::println); 
		
		System.out.println();
		
		List<String> answer = names.stream().map(String::toUpperCase).
		        collect(Collectors.toList());
		System.out.println(answer);
		
	
		
		
	}

}
