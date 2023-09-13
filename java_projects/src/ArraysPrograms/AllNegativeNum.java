package ArraysPrograms;
import java.util.*;
public class AllNegativeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int numbers[] = new int [n];
		System.out.print("Enter array elements : ");
		
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		checkNumbers(numbers);
		sc.close();
	}
	public static void checkNumbers(int[] numbers) {
		boolean neg = false;
	    int i = 0;

	    // check is there any negative numbers?
	    for (i = 0; i < numbers.length; i++) {
	      if(numbers[i] < 0){
	        neg = true;
	        break;
	      }
	    }
	  // this condition  will check the -ve numbers not valid
	    if(!neg) {
	      System.out.println("Array doesn’t contain negative number.");
	      return;
	    }
	    
	    System.out.println("Negative numbers = ");
	    for (i=0;i<numbers.length;i++) {
	      if(numbers[i] < 0) {
	        System.out.print(numbers[i]+" ");
	      }
	    }
		
	}

}
