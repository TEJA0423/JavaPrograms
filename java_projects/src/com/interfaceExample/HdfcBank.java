package com.interfaceExample;

public class HdfcBank implements Bank{

	@Override
	public void moneyTransfer() {
		System.out.println("Money Transfer from HDFC bank");
	}

	@Override
	public void checkBalance() {
		System.out.println("Check Balanace from HDFC bank");
	}

}
