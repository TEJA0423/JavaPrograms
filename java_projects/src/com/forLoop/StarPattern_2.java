package com.forLoop;

public class StarPattern_2 {

	public static void main(String[] args) {
	
	//LEFT SIDE
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");	
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");	
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	// RIGHT SIDE
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}