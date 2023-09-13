package ArraysPrograms;
import java.util.*;
public class RemoveEvenOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		int numbers [] = new int [n];
        System.out.println("Enter array  Elements :");
        
        for(int i=0; i<n;i++) {
        	numbers[i]=sc.nextInt();
        }
        int newarray[]=removedodd(numbers);
        
        System.out.println("Array after removing odd numbers: " 
                + Arrays.toString(newarray));
        // closing of scanner package
        sc.close();
	}
	public static int[]removedodd(int[] numbers) {
		
	    int countEven = 0;
	    int even[] = null;

	    for (int i : numbers) {  //it's counts the  even numbers
	      if (i % 2 == 0)
	        ++countEven;
	    }
	    even = new int[countEven];   // it stored even values

	    // check each element and insert
	    int i = 0;
	    for (int num : numbers) {
	      if (num % 2 == 0) { // even
	        even[i++] = num;
	      }
	    }
	    return even;
	}

}
