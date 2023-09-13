package com.simpleMultiThread;

public abstract class Triangle extends Shape{
	private double face1;
	private double face2;
	private double face3;
	
	public Triangle(double face1, double face2, double face3) {
		this.face1 = face1;
		this.face2 = face2;
		this.face3 = face3;
	} 
	@Override
	public double calculateArea() {
		double semiPerameter = (face1 + face2 + face3)/2;
				return Math.sqrt(semiPerameter *(semiPerameter - face1)*(semiPerameter - face2)*(semiPerameter - face3));
				
	}
	public double calculatePerameter() {
		return face1 + face2 +face3;
	}

}
