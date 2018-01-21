package com.assignments.java;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourseBundleExample {

	public static void main(String[] args) {
	
		ResourceBundle rb = ResourceBundle.getBundle("com.test.company");
		Enumeration<String> keys = rb.getKeys();
		
		while(keys.hasMoreElements()){
			
			String key =  keys.nextElement().toString();
			String value = rb.getString(key);
			System.out.println(key+": "+value);
			
		}
		
	}

}
