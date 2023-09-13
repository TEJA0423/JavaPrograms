package StringsPrograms;

import java.util.Arrays;

public class CnvrtStr_IntegerArr {

	public static void main(String[] args) {
		   String str = "[1,2,356,678,3378]";
		   
	        String[] string = str.replaceAll("\\[", "").replaceAll("]", "").split(",");
	 
	        // declaring an array with the size of string
	        int[] arr = new int[string.length];
	 
	        for (int i = 0; i < string.length; i++) {
	            arr[i] = Integer.valueOf(string[i]);
	        }
	        System.out.print("String : " + str);
	 
	        // printing the Integer array
	        System.out.print("\nInteger array : " + Arrays.toString(arr));
	}
	


}
