package ArraysPrograms;

import java.util.Arrays;

public class AddElementArray {

	public static void main(String[] args) {

	      int arr[] = { 30, 50, 20, 40, 10};
	  
	      int element = 99; // int position = 3;
	      
	      System.out.println("Original array: " + Arrays.toString(arr));
	      
	      // add element 
	      arr = addElement(arr, element); // position
	      System.out.println("New array: " + Arrays.toString(arr));
	   }
	// method to add element to array and return new array
	   public static int[] addElement(int[] arr, int element) { //int position add
	     
	      int temp[] = new int[arr.length+1];
	      for (int i = 0; i < arr.length; i++) { // j=0 ;i<temp.length
	    	  
	         temp[i] = arr[i];   //if(i==position){temp[i]=element[i];}else{temp[i]=arr[j++];}	     
	         }
	      // insert last element
	      temp[arr.length] = element;
	    return temp;
	   }

	   }
	   
