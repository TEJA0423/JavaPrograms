package com.forLoop;

public class TrianglePattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5; i++) {
			for(int j=i; j<=5;j++) {
				System.out.print(" ");	
			}
			for(int j=1; j<i;j++) {
				System.out.print(i+"");	
			}
			for(int j=1; j<=i;j++) {
				System.out.print(i+"");
			}
		    System.out.println();
	
	}
		System.out.println();
		
		for(int i=1, p=0; i<=n; i++,p+=2) {
			for(int j=i; j<=n;j++) {
				System.out.print(" ");	
			}
			for(int j=1; j<i;j++) {
				System.out.print(p+"");	
			}
			for(int j=1; j<=i;j++) {
				System.out.print(p+"");
			}
				System.out.println();		
	}
		System.out.println();
		
		for(int i=1, p=5; i<=n; i++,p--) {
			for(int j=i; j<=n;j++) {
				System.out.print(" ");	
			}
			for(int j=1; j<i;j++) {
				System.out.print(p+"");	
			}
			for(int j=1; j<=i;j++) {
				System.out.print(p+"");
			}
				System.out.println();		
	}
  }
}

