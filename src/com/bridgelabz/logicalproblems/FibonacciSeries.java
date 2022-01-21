package com.bridgelabz.logicalproblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int x = 10;
	int num1 = 0;
	int num2 = 1;
	int num3 = 1; 
	
	System.out.println("Fibonacci series is : ");
	
	
	for (int i = 1; i <= x; i++) {
	num1 = num2;
	num2 = num3;
	num3 = num1+num2;
	
	System.out.println(num1 + " ");
	}
}
}	