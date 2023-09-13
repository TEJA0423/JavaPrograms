package MethodsPrgrams;

import java.util.Arrays;

public class StringToIntArray {
	
	public static void main(String[] args) {
		
       String str[]= {"123", "234", "456", "567"};
       for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");	
		}
    // method calling here
       StringToIntArray(str);   
	} 
	// method creating here 
	private static void StringToIntArray(String[] str) {
		int size = str.length;
	      int [] arr = new int [size];
	      for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(str[i]);
	      }
	      System.out.println();
	      System.out.println(Arrays.toString(arr));
		
	}
}
