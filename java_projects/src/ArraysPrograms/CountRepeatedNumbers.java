package ArraysPrograms;

public class CountRepeatedNumbers {

	public static void main(String[] args) {
		 // original array
	      int arr[] = { 10, 20, 10, 40, 50, 20 };
	      System.out.println("The original array with duplicate numbers :");
         for(int i=0;i<arr.length;i++) {
        	 System.out.print(arr[i]+" ");	
         }
         System.out.println();
         int count =0;
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i]==arr[j]) {
        		 count++;
        	 }
        	}
         }
         System.out.println("The count of duplicates are :"+count);
	}

}
