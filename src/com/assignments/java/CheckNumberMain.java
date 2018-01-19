package com.assignments.java;

public class CheckNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumber num = new CheckNumber();
		
		Boolean isNum = num.isInteger("56");
		System.out.println("Is interger: "+isNum);
		
		Boolean isOdd = num.isOddNumber("56");
		System.out.println("Is interger: "+isOdd);
		
		Boolean isEven = num.isEvenNumber("56");
		System.out.println("Is interger: "+isEven);
		
		Boolean isPrime = num.isPrimeNumber("56");
		System.out.println("Is interger: "+isPrime);
		
	}

}
