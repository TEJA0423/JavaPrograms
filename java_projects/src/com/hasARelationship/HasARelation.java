package com.hasARelationship;

class A{
	void read() {
		System.out.println("class A");
	}
}
public class HasARelation {
	A a = new A();
	
	public static void main(String[] args) {
		HasARelation hr = new HasARelation();
		hr.a.read();
	
	}

	}


