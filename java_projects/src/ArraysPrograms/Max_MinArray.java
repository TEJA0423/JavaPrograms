package ArraysPrograms;

//import java.util.Arrays;

public class Max_MinArray {

	public static void main(String[] args) {
		 
	//  Write a java program to find min and max elements in the array
		
		int [] arr = {15, 8, 9, 2, 11, 4};
		
	//	Arrays.sort(arr);
//		
//		System.out.println("Min Element : "+ arr[0]);
//		System.out.println("Max Element  : "+ arr[arr.length-1]);
//		 

		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min Element : " + min);
		System.out.println("Max Element : " + max);
		
	}
		

	}


