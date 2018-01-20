package com.assignments.java;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append('a');
		sb.append('b');
		sb.append('c');
		sb.append('d');
		sb.append('e');
		sb.append('f');
		sb.append('g');
		sb.append('h');
		
		System.out.println(sb.toString());

		StringBuilder sBuilder = new StringBuilder();
		
		sBuilder.append('a');
		sBuilder.append('b');
		sBuilder.append('c');
		sBuilder.append('d');
		sBuilder.append('e');
		sBuilder.append('f');
		sBuilder.append('g');
		sBuilder.append('h');
		
		System.out.println(sBuilder.toString());
			

	}

}
