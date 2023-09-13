package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block start");
			String s = "hello";  //take null then exception will be occurred
			s.length(); // NPE
			System.out.println("try block end");
		} catch (Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}
		System.out.println("main( ) method ended...");
	}

}
