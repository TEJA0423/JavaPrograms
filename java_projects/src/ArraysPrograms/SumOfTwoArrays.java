package ArraysPrograms;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,3,6,4,2,9,6};
		int arr2[]= {6,4,3,1,8,2,3};
		
		int newarray[] = new int[arr1.length];
		
	    for (int i=0; i<arr1.length; i++) {
	    	
	    	newarray[i]=arr1[i]+arr2[i];	
	    }  
	    
	    System.out.println("Sum of Array Elements = "+ Arrays.toString(newarray));
	        
		     
		}

	}


