package com.constructors;

public class Employee {
	
//
//	public Employee(int i, int j) {
//		System.out.println(i + j);
//	}
//
//	public static void main (String[] args) {
//		Employee emp = new Employee(100, 200);
//	}


// using this keyword 
	
	String name;
	float salary;

// Constructor creating 
	
	public Employee(String name, float salary) {
		
// current object calling (this)	
		this.name = name;
		this.salary = salary;
		System.out.println(this.name + "--" + this.salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Raju", 55000.00f);
	}
}
