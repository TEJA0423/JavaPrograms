package ArraysPrograms;
import java.util.*;
public class AvgArrGreaterNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();
	    int numbers[] = new int[n];
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }
	    // find average value
	    double avg = average(numbers);
	    System.out.println("Average = " + avg);
	    
	    // display numbers greater then average
	    System.out.println("Numbers greater then average = ");
	    display(numbers, avg);
	    scan.close();
	  }

	  // method to display numbers greater than average
	  public static void display(int[] numbers, double avg) {
	    for (int i : numbers) {
	      if(i > avg)
	      System.out.print(i+" ");
	    }
	    
	  }
	  public static double average(int[] numbers) {
	    int sum = 0;
	    for (int i = 0; i < numbers.length; i++) {
	      sum += numbers[i]; // find sum
	    }
	    
	    // return average value
	    return sum/numbers.length;

	}

}
