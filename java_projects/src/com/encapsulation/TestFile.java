package com.encapsulation;

public class TestFile {
	
//	public static void main(String[] args) {
//
//		Account obj = new Account(); // obj creation
//		obj.setAccNum(797979);
//		obj.setName("Srinivas");
//
//		int accNum = obj.getAccNum();
//		String name = obj.getName();
//
//		System.out.println(accNum + "--" + name);
//	}
	
	
public static void main(String[] args) {
	Login obj = new Login();
	obj.setUserName("Teju");
	obj.setPassword("durga123");
	obj.setPhNumber(914245683);
	
	String userName = obj.getUserName();
	String password = obj.getPassWord();
	long phNumber = obj.getPhNumber();
	
	System.out.println(userName+"\n"+password+"\n"+phNumber);
	
	
	
}
}


