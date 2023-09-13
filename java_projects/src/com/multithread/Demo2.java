package com.multithread;

public class Demo2 implements Runnable { 
	
	// Java program to create the thread using Runnable interface
//	public void run() {
//		System.out.println("run () method called...");
//	}
//
//	public static void main(String... args) {
//
//		Demo d = new Demo();
//
//		Thread t = new Thread(d);
//		t.start();
//	}
	public void run() {
		System.out.println("run () method started...");

		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		System.out.println("run () method ended...");
	}

	public static void main(String... args) {
		Demo d = new Demo();

		Thread t = new Thread(d);
		t.start();
		 t.run();
	}
	
}
