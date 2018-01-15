package com.assignments.java;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter count for Fibonacci series");
		int count = input.nextInt();
		Integer[] numbers = new Integer[count];
		numbers[0] = 0;
		numbers[1] = 1;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		for(int i=2;i<count;i++){
			numbers[i] = numbers[i-1]+numbers[i-2];
			System.out.println(numbers[i]);
		}
		input.close();
		
		
	}

}
