package ArraysPrograms;

//import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		
		int num[]= {1,6,5,9,4,66,33,88};
//    	int n=num.length;
    	// sorting the array
//    	Arrays.sort(num);
//		System.out.println("Second Laergest number in Array : "+num[n-2]);
		int highest = num[0];
    	int secondhighest = num[0];
    	for(int i=0; i < num.length ;i++) {
    		
    		if(num[i] > highest) {
			secondhighest = highest;
    			highest = num[i];
    		}
    		if( num[i] < secondhighest) {
    			secondhighest = num[i];
    		}
    		
    	}
    	System.out.println(" First Highest number : "+ highest);   		
		System.out.println("Second Highest number : "+ secondhighest);
	
		
		}
}
