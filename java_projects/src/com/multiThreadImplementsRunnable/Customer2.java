package com.multiThreadImplementsRunnable;

public class Customer2 extends Thread{
	
	 Customer2(Banking b){
	    	this.b=b;
	    }
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

}
