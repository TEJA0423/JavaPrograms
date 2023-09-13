package com.multiThreadImplementsRunnable;

public class Customer1 extends Thread {
    Banking b;
    @Override
    public void run() {
    	try {
    		b.withdraw(5000.00f);
    	}
    	catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
    Customer1(Banking b){
    	this.b=b;
    }
	
}
