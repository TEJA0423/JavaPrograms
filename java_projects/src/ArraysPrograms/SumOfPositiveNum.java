package ArraysPrograms;
import java.util.*;
public class SumOfPositiveNum {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();
	    int numbers[] = new int[n]; //create new array

	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) { 
	      numbers[i] = scan.nextInt();
	    }
	    int sum = positiveSum(numbers);
	    
	    System.out.println("Sum of positive numbers = " + sum);

	    scan.close();
	  }

	  public static int positiveSum(int[] numbers) {
	   
	    int sum = 0;
	    for (int i : numbers) {
	      if(i >= 0) sum += i;
	    }
	    return sum;

	}

}
