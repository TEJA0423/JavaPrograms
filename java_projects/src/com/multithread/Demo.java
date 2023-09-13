package com.multithread;

public class Demo extends Thread{
	
	// Java program to create user defined thread using Thread class
	public void run() {
		System.out.println("run () method called...");
	}

	public static void main(String... args) {

		Demo d = new Demo();

		Thread t = new Thread(d);
		t.start();
	}

}
