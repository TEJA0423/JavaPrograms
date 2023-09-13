package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class DistictDemo {

	public static void main(String[] args) {
		   List<String> fullstackjava = Arrays.asList("core java","Advanced java","Spring Boot","Html","JavaScript","BootStrap","Css");
		   fullstackjava.stream().limit(4).forEach(System.out::println);
		   System.out.println();
		   fullstackjava.stream().skip(5).forEach(System.out::println);
		   System.out.println();
		   fullstackjava.stream().distinct().forEach(System.out::println);
		   
	        
	}

}
