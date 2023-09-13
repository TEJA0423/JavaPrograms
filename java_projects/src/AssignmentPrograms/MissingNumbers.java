package AssignmentPrograms;

public class MissingNumbers {

	 public static void main(String[] args)
	    {
	        int[] arr = { 1,2,3,5};
	        int N = arr.length;
	 
	        // Function call
	        int ans = getMissingNo(arr, N);
	        System.out.println(ans);
	    }
	 
	    // Function to find the missing number
	    static int getMissingNo(int[] arr, int n) {
	        int i = 0;
	        while (i < n) {
	        	 int correctpos = arr[i] - 1;
	             if (arr[i] < n && arr[i] != arr[correctpos]) {
	             swap(arr, i, correctpos);
            }
            else {
            	   i++;
            }
	         for (int index = 0; index < arr.length; index++) {
	              if (arr[index] != index + 1) {
	                  return index + 1;
	              }
	          }
	          
	          }
	        return arr.length;
	        }
	   
	      static void swap(int[] arr, int i, int correctpos)
	      {
	          // swap elements with their correct indexes
	          int temp = arr[i];
	          arr[i] = arr[correctpos];
	         arr[correctpos] = temp;
        }
}

