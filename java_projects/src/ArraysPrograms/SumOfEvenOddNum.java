package ArraysPrograms;
import java.util.*;
public class SumOfEvenOddNum {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();
	    int numbers[] = new int[n];
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }
	    // find of odd and even
	    oddEvenSum(numbers);
	    // close Scanner
	    scan.close();
	  }
	  
	  public static void oddEvenSum(int[] numbers) { // method to find sum of even-odd in array

	    int oddSum = 0;
	    int evenSum = 0;

	    for (int num : numbers) {
	      if (num % 2 == 0) { // even
	        evenSum += num;
	      } else {            // odd
	        oddSum += num;
	      }
	    }
	    System.out.println("Odd numbers sum = " + oddSum);
	    System.out.println("Even numbers sum = " + evenSum);

	}

}
