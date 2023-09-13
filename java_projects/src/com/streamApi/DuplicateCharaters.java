package com.streamApi;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class DuplicateCharaters {

	public static void main(String[] args) {
		String input = "SpringbootMicroSerivecesandWebServices";
		String[] Arr = input.split("");
		Stream<String> streamed = Arrays.stream(Arr);
		streamed.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()==3).map(i->i.getKey())
		.collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
