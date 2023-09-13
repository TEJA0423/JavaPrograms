package ArraysPrograms;
import java.util.*;
public class ArraySorting {
public static void main(String[] args) {
	int arr[] = { 5, 8, 2, 6, 9, 3 };

	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();

	for (int x : arr) {  // for Each loop 
		System.out.print(x + " ");
	}
	System.out.println();

	System.out.println(Arrays.toString(arr));
  }
}
