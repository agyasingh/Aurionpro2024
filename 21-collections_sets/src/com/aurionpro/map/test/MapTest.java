package com.aurionpro.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
//		map.put(1, "aagya");
//		map.put(2, "singh");
//		map.put(3, "poonam");
//		System.out.println(map);
		
		
//		LinkedHashMap<Integer,String> map2=new LinkedHashMap<Integer,String>();
//		map2.put(5, "aagya");
//		map2.put(4, "singh");
//		map2.put(7, "poonam");
//		System.out.println(map2);
//		
//		System.out.println("treemap");
//		TreeMap<Integer,String> map3=new TreeMap<Integer,String>();
//		map3.put(5, "aagya");
//		map3.put(4, "singh");
//		map3.put(7, "poonam");
//		System.out.println(map3);
		
		
		Set<Entry<Integer,String>> entries=map.entrySet();
		
		for(Entry<Integer,String> entry:entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
