package com.encapsulation;

public class Login {

	private String userName;
	private String passWord;
	private long phNumber;
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String passWord) {
		this.passWord=passWord;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber=phNumber;
	}
	public long getPhNumber() {
		return phNumber;
	}

}
