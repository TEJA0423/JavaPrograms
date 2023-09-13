package ArraysPrograms;
import java.util.*;
public class GreaterNumArray {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter size of array : ");
	   int n= sc.nextInt();
	   int numbers[]= new int[n];
	   System.out.print("Enter array Elements : ");
	   for(int i=0;i<n;i++) {
		   numbers[i]=sc.nextInt();
	   }
	   System.out.print("Enter number = ");
	    int num = sc.nextInt();
	    
	    // display numbers greater then given number
	    System.out.println("Numbers greater then given number = ");
	    display(numbers, num);

	    // close Scanner
	    sc.close();
	  }

	  // method to display numbers greater than given number
	  public static void display(int[] numbers, int num) {
	    // traverse through the array
	    for (int i : numbers) {
	      if(i > num)
	      System.out.print(i+" ");
	    }

	}

}
