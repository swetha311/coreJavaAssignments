package com.assignments.java;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("AL"," Alabama");
		hm.put("AK", "Alaska");
		hm.put("AR"," Arkansas");
		hm.put("CA","California");
		hm.put("AZ", "Arizona");
		hm.put("CO"," Colorado");
		hm.put("DE", "Delaware");
		hm.put("CT", "Connecticut");
		hm.put("HI"," Hawaii");
		hm.put("FL"," Florida");
		hm.put("GA","Georgia");
		hm.put("CT", "Connecticut");
		
		System.out.println("Printing key values in Hash map");
		System.out.println(hm.entrySet());
		
		System.out.println();
		System.out.println("Other way of printing key and value");
		Set<String> set = hm.keySet();
		for(String s : set){
			System.out.println("key is " +s+" Value is "+hm.get(s));
		}
		
	}

}



