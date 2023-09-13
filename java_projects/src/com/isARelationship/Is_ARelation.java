package com.isARelationship;

class user{
	int id;
	String name;

void speak() {
	System.out.println("Hi...\n My id is: "+ id +" \n "+"My name is: "+ name);
}
}
public class Is_ARelation extends user{
	public static void main(String[] args) {
		Is_ARelation isa= new Is_ARelation();
		isa.id=101;
		isa.name="Ram";
		isa.speak();
		
	}

}
