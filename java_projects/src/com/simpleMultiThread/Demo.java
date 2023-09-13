package com.simpleMultiThread;

public class Demo {

	private String name;
	private int age;
	
	public Demo(String name, int Age) {
		this.name = name;
		this.age = age;
	}
		public void setName(String newName) {
			this.name = newName;
		}
		
		public void setAge(int newAge) {
			this.age = newAge;
		}
		public String getName() {
		return name;
		}
		public int getAge() {
			return age;
		}
		
	public static void main(String[] args) {
		Demo d =new Demo("Ramu",28);
		Demo d1 =new Demo("Teju",22);
		
		d.setName("L.Ramu");
		d.setAge(24);
		d1.setName("Durga");
		d1.setAge(20);
		
	// Printing the updated attributes
		
		System.out.println("Name: " + d.getName());
		System.out.println("Age: " + d.getAge());
		
		System.out.println("Name: " + d1.getName());
		System.out.println("Age: " + d1.getAge());
		
		
	}

}
