package com.streamApi;

import java.util.Arrays;
import java.util.List;
public class MapExample {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Ram", 29, 25000.0);
		Student stud2 = new Student("Jaya", 25, 12000.0);
		Student stud3 = new Student("Sailu", 30, 27000.0);
		Student stud4 = new Student("Sushma", 22, 16000.0);
		Student stud5 = new Student("Raju", 19, 7000.0);
		
		List<Student> listofStudent = Arrays.asList(stud1, stud2,stud3,stud4,stud5);
		
		listofStudent.stream()
		.filter(stud -> stud.salary < 20000.0)
		.map(name -> name.age)
		.forEach(System.out::println);
		
	}

}
