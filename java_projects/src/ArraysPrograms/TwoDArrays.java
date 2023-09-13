package ArraysPrograms;

import java.util.Arrays;

public class TwoDArrays {
	public static void main(String[] args) {
		 // declare and initialize an array
	    int arr[][] = {{50,60},{70,80},{90,100}};
	    
	    // display 2D array using for-each loop
	    for(int[] k : arr) {
	      for(int j : k) {
	        System.out.print(j + " ");
	      }
	    }
	    System.out.println();
	    
	    
	   // display 2D array using For Loop
	  
	    for(int i=0; i<arr.length; i++) {
	        for(int j=0; j<arr[i].length; j++) {
	          System.out.print(arr[i][j] + " ");
	        }
	      }
	    System.out.println();
	    

	    // display 2D array using Arrays.deepToString()
	    System.out.print(Arrays.deepToString(arr));
	}
}


	    
	


