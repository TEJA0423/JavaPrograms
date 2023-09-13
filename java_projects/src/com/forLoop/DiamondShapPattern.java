package com.forLoop;

public class DiamondShapPattern {

	public static void main(String[] args) {
		
		//LEFT SIDE PATTERN LOGIC USING FOR LOOP
		
				for(int i=1; i<=5; i++) {
					for(int j=4; j>=i; j--) {
						System.out.print(" ");	
					}
					for(int k=1; k<=i; k++) {
						System.out.print("* "); // remove space from * see what happened
					}
					System.out.println();
				}		
				System.out.println();
				
			//	BOTTOM LEFT SIDE PATTERN LOGIC USING FOR LOOP
				
				for(int i=1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(" ");	
					}
					for(int k=5; k>=i; k--) {
						System.out.print("* "); 
					}
					System.out.println();
				}
				System.out.println(); 
		// DIAMONDSHAP PATTERN LOGIC USING FOR LOOP
				
				for(int i=1; i<=5; i++) {
					for(int j=4; j>=i; j--) {
						System.out.print(" ");	
					}
					for(int k=1; k<=i; k++) {
						System.out.print(" *");
					}
					System.out.println();
				}	
				for(int i=1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(" ");	
					}
					for(int k=4; k>=i; k--) {
						System.out.print(" *");
					}
					System.out.println();
				}

	}

}
