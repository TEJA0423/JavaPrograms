package ArraysPrograms;

public class LargestNumberArray {

	public static void main(String[] args) {
	
		  // declare a variable max
			int array[]= {5,8,9,-3,7,2,0,19};
		     int max = 0;

		  // assign first element to max
		    max = array[0];

		  // using For loop
		    
		  for (int i = 1; i < array.length; i++) {
			  
		    // compare
			  
		    if (max < array[i]) {
		    	max = array[i];
		    }
		  }

		System.out.println("Largest Number in array :"+max);

		  
	}

}
