package com.assignments.java;

public class CheckNumber {

     public Boolean isInteger(String str){
    	 try{
    		 Integer.parseInt(str);
    	 }
    	 catch(NumberFormatException e){
    		 return false;
    	 }
    	 return true;
    	 
    	 
     }
     public Boolean isOddNumber(String str){
    	
    		 int num = Integer.parseInt(str);
    		 if (num % 2 ==0){
    			 return false;
    		 }else return true;
    	
     }
     
     public Boolean isEvenNumber(String str){

		 int num = Integer.parseInt(str);
		 if (num % 2 !=0){
			 return false;
		 }else return true;
     }
     public Boolean isPrimeNumber(String str){
    	 int num = Integer.parseInt(str);
    	 if (num < 2) return false;
         if (num == 2) return true;
         if (num % 2 == 0) return false;
         for (int i = 3; i * i <= num; i += 2)
             if (num % i == 0) return false;
         return true;
     }

}
