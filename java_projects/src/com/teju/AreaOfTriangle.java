package com.teju;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
	// Find the values Area and Parameter of Triangle 
	
		double Base = 6.5;
		double Height = 4.3;
		
		double Area = (Base * Height)/2;   // 1/2*(b*h) formula
		
		System.out.println("Area of Triangle is :"+ Area);
		
		System.out.println();
		
		double parameter = Area + Base + Height; // formula p=a+b+h
		
		System.out.println("Perameters of Triangle is : "+ parameter);

	}

}
