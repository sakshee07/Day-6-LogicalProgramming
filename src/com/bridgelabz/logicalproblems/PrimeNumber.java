package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int i,number,count = 0;
		Scanner scanner = new Scanner (System.in);
         System.out.println("Enter num : ");	
         number = scanner.nextInt();

      for (i = 2; i <= number/2; i++) {
    	  if (number % i == 0) {
    		  count++;
    		  break;
    	  }
      }
    	  if ( count == 0 && number != 1) {
    		  System.out.println("given num is prime number");
    	  }
    	  else {
    		  System.out.println(" given number is not prime number");
    	  }
	}
}