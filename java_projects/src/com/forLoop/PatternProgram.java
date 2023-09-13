package com.forLoop;

public class PatternProgram {

	public static void main(String[] args) {
		
	// RIGHT SIDE PATTERN LOGIC
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" "); // ("*") 
			}
			System.out.println();
		}
		
		System.out.println();
		
	//REVERSE PATTERN LOGIC
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(i+" ");
//				if(i%2==0) {
//				System.out.print("2");
//				}else {
//					System.out.print("1");
//				}
			}
			System.out.println();
		}
		
		System.out.println();
		
	// TOP AND BOTTOM RIGHT SIDE PATTERN LOGIC 
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
