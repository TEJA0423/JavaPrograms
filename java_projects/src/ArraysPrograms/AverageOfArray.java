package ArraysPrograms;

public class AverageOfArray {

	public static void main(String[] args) {
	// Java program to calculate the average of an array
   double array[]= {10,32,46,53,92,46};
   double sum=0.0;
   double average =0.0;
   
   for(int i=0;i<array.length;i++) {
	   sum+=array[i];   
   }
   System.out.println("sum of Array: "+sum);
   
   average =sum/array.length;
   
   System.out.println("Average value of array: "+average);
	}

}
