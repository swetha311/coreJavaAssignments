package com.assignments.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> states = new ArrayList<String>();
		HashSet<String> hset = new HashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		
		states.add("Delaware");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Colorado");
		states.add("Connecticut");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Colorado");
	
		
		hset.addAll(states);
		ts.addAll(states);
		
		System.out.println("Printing states from ArrayList");
		for (int i=0; i<states.size(); i++){
			System.out.println(states.get(i));
		}
		System.out.println();
		System.out.println("Printing states from HashSet");
		for (String state : hset){
			System.out.println(state);
		}
		System.out.println();
		System.out.println("Printing list from TreeSet");
		
		for (String state : ts){
			System.out.println(state);
		}
		
		
	}

}
