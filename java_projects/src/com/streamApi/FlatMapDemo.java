package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {
		
        List<String> javacourse = Arrays.asList("core java","Advanced java","Spring Boot");
        
        List<String> Uicourse = Arrays.asList("Html","JavaScript","BootStrap","Css");
        
        List<List<String>> courses = Arrays.asList(javacourse, Uicourse);
        
        courses.stream().flatMap(s -> s.stream()).forEach(System.out::println);
        
	}

}
