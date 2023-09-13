package ArraysPrograms;
import java.util.*;
public class DisplayEvenOddNum {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of the array: ");
	    int n = scan.nextInt();          // read size of the array
	    int numbers[] = new int[n]; // create size of the array
	    System.out.println("Enter array elements: ");
	    for (int i = 0; i < n; ++i) {
	      numbers[i] = scan.nextInt();
	    }
	    // display odd-even
	    displayOddEven(numbers);

	    // close Scanner
	    scan.close();

	  }
	  
	public static void displayOddEven(int[] numbers) {  // method to display even or odd in array
	    // traverse through the array
	    for (int i : numbers) {
	      if(i%2 == 0)       {
	        System.out.println(i+": Even");
	      } else {               
	        System.out.println(i+": Odd");
	      }
	    }   
	}

}
