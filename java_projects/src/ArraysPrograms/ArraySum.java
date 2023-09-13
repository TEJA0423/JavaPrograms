package ArraysPrograms;

public class ArraySum {
	 public static void main(String[] args)throws Exception {
	//  Java program to calculate the Sum of an array
		 int array[]= {10,20,30,40,50};
		 int sum = 0;
		 for(int i=0;i<array.length;i++) {
			 sum +=array[i];
		 }
		 System.out.println("Sum of Array Elements = "+sum);
		 
			
	}

}
