package com.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class RandomTables {
			public static void main(String[] args) 
			          throws IOException {
				
				    System.out.println("Enter a Number:");	
				    
				    InputStreamReader isr = new InputStreamReader(System.in);
				    BufferedReader br = new BufferedReader(isr);
				    String result = br.readLine();
				    int a = Integer.parseInt(result); //  int a=15;
				    
				 	 for(int n=1; n<=10;n++) {
				    	System.out.println(a + " * "+ n + "= " + a*n);
				    }
	}

}
