package com.multiThreadImplementsRunnable;

public class BankApplicationTest {
	
	public static void main(String[] args) {
	  Banking b = new Banking();
	  Customer1 c1 = new Customer1(b);
	  c1.start();
	  
	  Customer2 c2 = new Customer2(b);
	  c2.start();
	}

}
