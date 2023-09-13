package ArraysPrograms;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		
	      Scanner scan = new Scanner(System.in);
	      int arr[] = { 50, 90, 30, 70, 60 };
	      int key = 0;
	      System.out.print("Enter search key: ");
	      key = scan.nextInt();
	      int size = arr.length;

	      // linear search
	      int index = linearSearch(arr, size, key);

	      // display result
	      if (index == -1)
	         System.out.println(key + " not Found.");
	      else
	         System.out.println(key + " Found at Index = " + index);
	      scan.close();

	   }

	   public static int linearSearch(int[] arr, int size, int key) {
	    
	      for (int i = 0; i < size; i++) {
	         if (key == arr[i])
	            return i;
	      }
	      return -1;

	}

}
