package com.multiThreadImplementsRunnable;

public class Banking {
	float balance = 5000.00f;
	synchronized void withdraw(float amount) throws InterruptedException {
		System.out.println("withdraw started.............");
		if(balance < amount) {
			System.out.println("you have less balance, wait for deposit......");
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(6000);
		balance -= amount;
		System.out.println("withdraw completed !");
	}
	
	synchronized void deposit(float amount) throws InterruptedException{
		 System.out.println("deposit started..........");
		 Thread.sleep(8000);
		 balance =+amount;
		 System.out.println("deposit completed.........");
		 notify();
	}

}
