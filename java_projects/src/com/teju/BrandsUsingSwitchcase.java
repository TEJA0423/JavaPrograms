package com.teju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrandsUsingSwitchcase {

	public static void main(String[] args) 
	          throws IOException {
		
		    System.out.println("Enter a Brand:");
		    
		    InputStreamReader isr = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(isr);
		    String brands = br.readLine();
		    
			switch(brands) {
		    
		    case "Nike" :
		    	System.out.println( " Just Do it");
		    	break;
		    case "Adidas":
		    	System.out.println(" Impossible is Nothing");
		    	break;
		    case "Puma":
		    	System.out.println(" Forever Faster");
		    	break;
		    case "Reebok":
		    	System.out.println("I Am What I Am");
		    	break;
		    default:
		    	System.out.println("Brands not Found");
		   		    	
		    }

	}

}
