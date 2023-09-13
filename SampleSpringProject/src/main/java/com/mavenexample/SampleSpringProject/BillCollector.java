package com.mavenexample.SampleSpringProject;

public class BillCollector {
	private Payment p;
	
	
public Payment getP() {
		return p;
	}


	public void setP(Payment p) {
		this.p = p;
	}


public void billpay(double amount) {
	String result = p.pay();
	System.out.println(result);
}
}
