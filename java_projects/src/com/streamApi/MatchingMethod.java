package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingMethod {

	public static void main(String[] args) {
		Student stud1 = new Student("Ram", 29, 25000.0);
		Student stud2 = new Student("Jaya", 25, 12000.0);
		Student stud3 = new Student("Sailu", 30, 27000.0);
		Student stud4 = new Student("Sushma", 22, 16000.0);
		Student stud5 = new Student("Raju", 19, 7000.0);
		
		List<Student> listofStudent = Arrays.asList(stud1, stud2,stud3,stud4,stud5);
		boolean anyRam = listofStudent.stream().anyMatch(s -> s.name.equals("Ram"));
		System.out.println("Any Indian available : "+anyRam);
		
		boolean allRam = listofStudent.stream().allMatch(s -> s.name.equals("Ram"));
		System.out.println("All the Persons are allRam? : "+allRam);
		
		boolean noneMatch = listofStudent.stream().noneMatch(s -> s.name.equals("Ramu"));
		System.out.println("Any Indian available : "+noneMatch);
	}

}
