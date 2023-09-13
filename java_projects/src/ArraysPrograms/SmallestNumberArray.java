package ArraysPrograms;

public class SmallestNumberArray {

	public static void main(String[] args) {
		int array[]= {5,8,9,-3,7,2,1,-1};
		
//	     int min = 0;
//	     
//	     min = array[0];
//
//	     // for loop
//	     for (int i = 1; i < array.length; i++) {
//	        
//	        if (min > array[i])
//	        min = array[i];
//	     }
//	     
//       System.out.println("Smallest Number in Array : "+ min);
		
		int smallest = array[0];
		int secondsmallest = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] < smallest) {
				secondsmallest = smallest;
				smallest= array[i];
			}
			if(array[0] > secondsmallest) {
				secondsmallest=array[i];
			}
		}
		System.out.println("Smallest Number in Array : "+ smallest);
		System.out.println("SecondSmallest Number in Array : "+ secondsmallest);
	}

}
