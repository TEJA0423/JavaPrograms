package com.map_programs;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		Map<String,Integer> map = new Hashtable<>();
		
		map.put("Hyderabad", 1234);
		map.put("Vizag", 2345);
		map.put("Eluru", 3456);
		map.put("TadepalliGudem",4567);
		map.put("Bhimavaram", 5678);
		
		System.out.println(map);
		System.out.println();
		
// retrieval of keys from the map	
		
	Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println();
		
// retrieval of values from the map		
		
	 Collection<Integer> values =  map.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		System.out.println();
		
		for(String key: keys) {
			System.out.println(key + " >>>>> " + map.get(key));
		}
		System.out.println();
		
		map.remove("Vizag");
		System.out.println(map);

		// Entry retrieval of the map 
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries ) {
			String key = entry.getKey();
			Integer value = entry.getValue();
		
		}
		System.out.println(keys+ " >>>> "+ values);
		
		map.clear();
	System.out.println(map);
	}
}
