package com.java_8;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;
		
		System.out.println(p.test(5)+"\n");
		System.out.println(p.test(15));
	}

}

