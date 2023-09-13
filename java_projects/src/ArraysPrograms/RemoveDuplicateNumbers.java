package ArraysPrograms;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
	      int arr[] = {10, 10, 20, 20, 30, 40, 40, 50, 60};
	      
	     // find the length of the array
	      int len =arr.length;
	      System.out.println("Length of the array: "+ len);
	      
	      int j=0;
	      // For Loop creating
	       
	      for(int i=0; i < len-1; i++) {
	    	  
	    	  if(arr[i]!=arr[i+1]) {
	    		  arr[j++]=arr[i];
	    	  }
	      }
	      arr[j++]=arr[len-1];
	      
	      for(int k=0; k<j;k++) {
	    	  System.out.print(arr[k]+" ");
	      }
	      

		

	}

}
