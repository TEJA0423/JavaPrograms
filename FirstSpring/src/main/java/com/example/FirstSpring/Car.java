package com.example.FirstSpring;

public class Car {
	
	public Car() {
	System.out.println("Car Class Constructor");
	} 

	private DieselEngine dieselEngine;
	
	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;	
	}
	
	public  void driver() {
		
	int result = dieselEngine.start();
	
	if(result>=1) {
		System.out.println("Car started for journey");
	}
	else {
		System.out.println("Engine has some problem");	
	  }
	
	}	
}
