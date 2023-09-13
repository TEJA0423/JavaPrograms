package com.map_programs;
import java.util.*;
import java.util.Map.Entry;

public class EntryLargestMap {

	public static void main(String[] args) {
		
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

     map.put(1, 4);
     map.put(2, 5);
     map.put(3, 7);
     map.put(4, 2);

     int maxValueInMap = (Collections.max(map.values()));

     // Iterate through HashMap
     for (Entry<Integer, Integer> entry :
          map.entrySet()) {

         if (entry.getValue() == maxValueInMap) {

             // Print the key with max value
             System.out.println("Entry with highest valuein map is : "+entry.getKey()+"("+entry.getValue()+")");
         }
     }
	}

}
