package com.hasARelationship;

public class Test {

	public static void main(String[] args) {
     One a = new One();
     a.m1(a);
     a.m1(new Two());
     
     Two t = new Two();
      t.m1(null);
      
      a=t;
      a.m1(null);
      a.m1(new One());
	}

}
