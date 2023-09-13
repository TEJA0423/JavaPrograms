package com.interfaceExample;

public class BankAdmin {

	public static void main(String[] args) {
		
	// Reference variable	
		Bank b;
	//Storing implements object	into ref variable
		b=new AxisBank();
	//Axis bank method will be called here	
		b.moneyTransfer();
		b.checkBalance();
	//Storing implements object	into ref variable
		b=new HdfcBank();	
	//Hdfc bank method will be called here	
		b.moneyTransfer();
		b.checkBalance();
		
	}

}
