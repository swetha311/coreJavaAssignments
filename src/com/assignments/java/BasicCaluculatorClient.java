package com.assignments.java;

public class BasicCaluculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCaluculator calc = new BasicCaluculator();
		
		System.out.println("addition of 10 and 5 is " +calc.add(10, 5));
		System.out.println("addition of 10 and 5 is " +calc.subtract(10, 5));
		System.out.println("addition of 10 and 5 is " +calc.multiply(10, 5));
		System.out.println("addition of 10 and 5 is " +calc.divide(10, 5));

	}

}
