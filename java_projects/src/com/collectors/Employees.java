package com.collectors;

public class Employees {
	int id;
	String name;
	int age;
	String Gender;
	String Department;
	int YearOfJoining;
	int salary;
	
	public  Employees (int id,String name, int age, String Gender, String Department, int YearOfJoing, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age  = age;
		this.Gender = Gender;
		this.Department = Department;
		this.YearOfJoining =YearOfJoing;
		this.salary = salary;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getYearOfJoining() {
		return YearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		YearOfJoining = yearOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", Gender=" + Gender + ", Department="
				+ Department + ", YearOfJoining=" + YearOfJoining + ", salary=" + salary + "]";
	}
}
