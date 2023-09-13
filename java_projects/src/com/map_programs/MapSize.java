package com.map_programs;
import java.util.*;
public class MapSize {

	public static void main(String[] args) {
		
//     Map m= new HashMap(); // Non-Generic  Input 
		
	   Map<Integer, String> m = new HashMap<Integer, String>(); //Generic Input
     
     m.put(1,"Ramu");
     m.put(2,"Teju");
     m.put(3,"Gayathri");
     m.put(4,"Kalyan");
     m.put(5,"Sai");
     
     System.out.println(m);
     
     System.out.println("Size of the map is : "+ m.size());
	}

}
