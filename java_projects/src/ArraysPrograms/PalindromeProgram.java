package ArraysPrograms;
import java.util.*;
public class PalindromeProgram {

	public static void main(String[] args) {
//		int n,c,r,s=0;
//		System.out.println("Enter your Numbers: ");
//		Scanner num= new Scanner(System.in);
//		 n = num.nextInt();
//		 c=n;
//		 while(n>0) {
//			 r=n%10;
//			 s=(s*10)+r;
//			 n=n/10;
//		 }
//		 if(c==s) {
//			 System.out.println("Palindrome Number");
//		 }else {
//			 System.out.println("not a Palindrome Number");
//		 }
//		 
			   int arr[] = { 1, 2, 3, 2, 1 };
		        int n = arr.length;
			int temp = 0;
			 
	       
	        for (int i = 0; i <= n / 2 && n != 0; i++) {
	 
	            
	            if (arr[i] != arr[n - i - 1]) {
	                temp = 1;
	                break;
	            }
	        }  
	        if (temp == 1)
	            System.out.println("Not Palindrome");
	        else
	            System.out.println("Palindrome");
	    }
	 
	    
	}


