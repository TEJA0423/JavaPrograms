package com.streamApi;

import java.util.Arrays;

public class ReduceSumDemo {

	public static void main(String[] args) {
		int [] nums = {1, 2, 3, 4, 5, 6};
		int reducedValue = Arrays.stream(nums).reduce(0, (a,b) -> a+b);
		System.out.println("The reduced value is : "+reducedValue);
		
		System.out.println("*********************************");
		
		int sum = Arrays.stream(nums).reduce(0,
                (element1, element2) -> element1 + element2);
		System.out.println("The sum of all elements is " + sum);

	}

}
