package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	
int i,Sum = 0;int n;
Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter num : ");
		n = scanner.nextInt();
		
		for(i=1; i<n; i++) {
			if (n%i == 0) {
		Sum = Sum +i;
			}
		}
		if (Sum ==  n ) {
			System.out.println(n+" is perfrct number" );
		}
		else { 
		System.out.println(n+" is not perfrct number ");
		}
	}
}