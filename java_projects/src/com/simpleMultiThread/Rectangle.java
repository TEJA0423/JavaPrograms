package com.simpleMultiThread;

public abstract class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	public double calculateArea() {
		 return width * height;
	 }
	public double calculatePerameter() {
		 return 2*(width * height);
	 }
     
}
