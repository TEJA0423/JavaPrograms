package MethodsPrgrams;

public class EvenNumUsingMethods {

	public static void main(String[] args) {
		int arr[]= {2,4,6,3,5,7};
		System.out.println("Length of the Array is :"+arr.length+"\n");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" "+"\n");
		}
		FindEvenNum(arr);
	}

	private static void FindEvenNum(int arr[]) {
		int evensum = 0;
		int oddsum =0;
		for (int num : arr) {
	      if (num % 2 == 0) { // even
	        evensum += num;
	      } else {            // odd
	        oddsum += num;
	      }
	    }
		System.out.println("Sum of Even numbers = "+evensum+"\n");
		System.out.println("Sum of odd numbers = "+oddsum);
	}

}
