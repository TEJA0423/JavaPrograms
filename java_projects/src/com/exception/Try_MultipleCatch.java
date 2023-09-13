package com.exception;

public class Try_MultipleCatch {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block start");
			String s = "hi";
			int i = s.length();
			System.out.println("try block end");
		}
		catch (ArithmeticException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	// this parent-catch will take top of child-catch then we will get exception or error
		catch (Exception e) {   
			e.printStackTrace();
		}
		System.out.println("main( ) method ended...");

	}

}
