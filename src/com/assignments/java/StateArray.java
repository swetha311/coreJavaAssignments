package com.assignments.java;

import java.util.ArrayList;
import java.util.List;

public class StateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<State> stateAl = new ArrayList<State>();

		State s1 = new State("CA", "California", "Sacramento");
		State s2 = new State("AL", "Alabama", "Montgomery");
		State s3 = new State("AZ", "Arizona", "Phoenix");
		State s4 = new State("AK", "Alaska", "Juneau");
		State s5 = new State("AR", "Arkansas", "Little Rock");
		State s6 = new State("CO", "Colorado", "Denver");
		State s7 = new State("CT", "Connecticut", "Hartford");
		State s8 = new State("DE", "Delaware", "Dover");
		State s9 = new State("FL", "Florida", "Tallahassee");
		State s10 = new State("GA", "Georgia", "Atlanta");

		// adding to Arraylist

		stateAl.add(s1);
		stateAl.add(s2);
		stateAl.add(s3);
		stateAl.add(s4);
		stateAl.add(s5);
		stateAl.add(s6);
		stateAl.add(s7);
		stateAl.add(s8);
		stateAl.add(s9);
		stateAl.add(s10);

		// printing state object
		for (State stateObject : stateAl) {

			System.out.println("state code is " + stateObject.stateCode);
			System.out.println("state name is " + stateObject.stateName);
			System.out.println("state capital is " + stateObject.capital);
			System.out.println();
		}

	}

}
