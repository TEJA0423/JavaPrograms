package com.teju;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		
//         Scanner input = new Scanner(System.in); 
//      int number = input.nextInt();
		
		System.out.println("Enter a number : ");
		InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br= new BufferedReader(isr);
	    String result = br.readLine();
	    int number=Integer.parseInt(result);
         

         boolean isPrime= true;
         if(number==0 && number==1) {
        	 isPrime=false;
         }
         for(int i=2;i<number/2; i++) {
        	 if(number%i==0) {
        		 isPrime=false;
        		 break;
        	 }
         }
         if(isPrime) {
        	 System.out.println(number+" "+ "is a prime number.");
         }else {
        	 System.out.println(number+" "+ "is not a prime number.");
        	 
         }
         
	}

}
