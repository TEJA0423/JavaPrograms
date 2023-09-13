package com.forLoop;

import java.io.*;

public class EmployeePf {

	public static void main(String[] args) throws Exception {
// Write a java program to read person basic salary and calculate Provident Fund amount from the basic salary	
    
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader (isr);
		
		System.out.println("Enter Basic Salary");
		String str = br.readLine ( );

		double basicSalary = Double.parseDouble ( str );

		double pf = basicSalary * 12 / 100;

		System.out.println(pf);	
	}

}
