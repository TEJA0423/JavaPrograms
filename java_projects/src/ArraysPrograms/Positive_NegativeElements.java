package ArraysPrograms;
import java.util.*;
public class Positive_NegativeElements {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();
	    int numbers[] = new int[n];
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }
	    checkNumbers(numbers);  // find of +ve, -ve, and zero
	    scan.close();
	  }

	  public static void checkNumbers(int[] numbers) {

	
	    int positive = 0;
	    int negative = 0;
	    int zero = 0;

	    for (int num : numbers) {
	      if (num > 0) {        // +ve
	        ++positive;
	      } else if (num < 0) { // -ve
	        ++negative;
	      } else {              // 0
	        ++zero;
	      }
	    }
	    System.out.println("Positive numbers = " + positive);
	    System.out.println("Negative numbers = " + negative);
	    System.out.println("Zeros = " + zero);
	}

}
