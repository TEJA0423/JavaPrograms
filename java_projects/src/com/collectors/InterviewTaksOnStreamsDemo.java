package com.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewTaksOnStreamsDemo {
	
	public static void main(String[] args) {
		List<Employees> employeeList = new ArrayList<>();

		employeeList.add(new Employees(1, "Jhansi ", 32, "Female", "HR ", 2011, 25000));
		employeeList.add(new Employees(2, "Smith ", 25, "Male", "Sales", 2015, 32500));
		employeeList.add(new Employees(3, "David", 29, "Male", "infrastructure", 2015, 18000));
		employeeList.add(new Employees(4, "orien", 28, "Male", "Development", 2014, 32500));
		employeeList.add(new Employees(5, "Charles", 27, "Male", "HR", 2013, 22700));
		employeeList.add(new Employees(6, "Cathy", 43, "Male", "Security", 2016, 10500));
		employeeList.add(new Employees(7, "Ramesh", 35, "Male", "Finance", 2010, 27000));
		employeeList.add(new Employees(8, "Suresh", 31, "Male", "Development", 2015, 34500));
		employeeList.add(new Employees(9, "Gita", 24, "Female", "Sales", 2016, 11500));
		employeeList.add(new Employees(10, "Mahesh", 38, "Male", "Security", 2015, 11000));
		employeeList.add(new Employees(11, "Gouri", 27, "Female", "infrastructure", 2015, 15700));
		employeeList.add(new Employees(12, "Nithin", 25, "Male", "Development", 2016, 28200));
		employeeList.add(new Employees(13, "Swathi", 27, "Female", "Finance", 2013, 21300));
		employeeList.add(new Employees(14, "Buttler", 24, "Male", "Sales", 2017, 10700));
		employeeList.add(new Employees(15, "Ashok", 23, "Male", "infrastructure", 2018, 12700));
		employeeList.add(new Employees(4, "Sanvi", 26, "Female", "Development", 2015, 28900));

// 11. What is the average salary of Male and Female Employees
		Map<String, Double> AvgSalary = employeeList.stream().collect(
				Collectors.groupingBy((Employees::getGender), Collectors.averagingDouble(Employees::getSalary)));
		System.out.println(AvgSalary);
		System.out.println("--------------------------------------------------------------------");
// 12. List down the names of all employees in each department ?

		Map<String, List<String>> allnames = employeeList.stream().collect(Collectors
				.groupingBy((Employees::getDepartment), Collectors.mapping(Employees::getName, Collectors.toList())));
		System.out.println(allnames);
		System.out.println("--------------------------------------------------------------------");

// 13. What is the average salary and Total Salary of whole organization ?

		  OptionalDouble average = employeeList.stream().mapToDouble(e ->e.getSalary()).average(); 
		  Double collect = employeeList.stream().collect(Collectors.summingDouble(Employees::getSalary));
		  System.out.println(collect);
		  double sum = employeeList.stream().mapToDouble(e ->e.getSalary()).sum();
		  
		  if (average.isPresent()) {
			  System.out.println(average.getAsDouble() +" and sum is " + sum); 
		  } else System.out.println("no avg is found");
		 
		System.out.println("--------------------------------------------------------------------");
// 14. Separate the employees who are younger or equal to 25 years from those

		List<String> younger = employeeList.stream().filter(e -> e.getAge() <= 25).map(Employees::getName)
				.collect(Collectors.toList());
		System.out.println(younger);
		System.out.println("--------------------------------------------------------------------");
// 15. Who is the oldest employee in the organization ?

		Optional<Employees> collect4 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employees::getYearOfJoining)));

		if (collect4.isPresent())
			System.out.println(collect4.get().getName());
		else
			System.out.println("no employee found");
		System.out.println("--------------------------------------------------------------------");

// 16. Find the Second highest salaried employee details in the organization ?
		
		 Optional<Employees> findFirst = employeeList.stream()
					.sorted(Comparator.comparingDouble(Employees::getSalary).reversed())
					.skip(1).findFirst();
			if(findFirst.isPresent()) System.out.println(findFirst.get().getSalary());
			else System.out.println("not found 2nd hgihest");

	}

}
