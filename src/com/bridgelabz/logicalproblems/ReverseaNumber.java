package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		int num= 0;
		int reversenum= 0;
		System.out.println("enter a number : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		while(num != 0) {
			reversenum = reversenum*10;
			reversenum = reversenum + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse num :  " + reversenum  );
	}

}
