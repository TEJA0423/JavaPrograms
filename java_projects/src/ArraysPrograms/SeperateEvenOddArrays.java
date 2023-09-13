package ArraysPrograms;

import java.util.*;

public class SeperateEvenOddArrays {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);    //take inputs from keyboard
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt(); 
	    int numbers[] = new int[n];    // create an int array of size n

	    // take input for the array
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }
	    
	    displayOddEven(numbers);
	    
	    scan.close();
	  }
	  // method to display even or odd in array
	  public static void displayOddEven(int[] numbers) {

	    // variables
	    int countEven = 0;
	    int countOdd = 0;
	    int even[] = null;
	    int odd[] = null;

	    // count even numbers
	    for (int i : numbers) {
	      if (i % 2 == 0)
	        ++countEven;
	    }
	    // count odd numbers
	    countOdd = numbers.length - countEven;
	    
	    even = new int[countEven]; // it is used for storing values
	    odd = new int[countOdd];

	    int i = 0;
	    int j = 0;
	    for (int num : numbers) {
	      if (num % 2 == 0) { // even
	        even[i++] = num;
	      } else {
	        odd[j++] = num;
	      }
	    }
	    
	    // display even & odd arrays
	    System.out.println("Even numbers: "  + Arrays.toString(even));
	    System.out.println("Odd numbers: " + Arrays.toString(odd));
	  
          }
	}


