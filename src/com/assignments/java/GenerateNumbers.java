package com.assignments.java;

public class GenerateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate numbers to 1000
		for(int i=1;i<=1000;i++){
			System.out.println(i);
		}

		//Generate multiples of 5 less than 1000
		for(int i=1;i<=1000;i++){
			if(i % 5 == 0){
				System.out.println(i);
			}
		}
		
		//Generate odd numbers less than 1000
		for(int i=1;i<=1000;i++){
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}

}
