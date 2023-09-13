package com.interfaceExample;

public class AxisBank implements Bank{

	@Override
	public void moneyTransfer() {
		System.out.println("Money Transfer from Axis bank");
	}

	@Override
	public void checkBalance() {
		System.out.println("Check Balance from Axis bank");
		
	}

}
