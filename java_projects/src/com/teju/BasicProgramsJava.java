package com.teju;

import java.util.Scanner;

public class BasicProgramsJava {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your 1st number: ");
		int num1=in.nextInt();
		
		System.out.println("Enter your 2nd number: ");
		int num2=in.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
	}

}
