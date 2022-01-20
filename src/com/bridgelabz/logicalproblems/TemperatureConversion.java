package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		float cen;
		double fah;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("temp in celsius : ");
		cen = scanner.nextFloat();
		
		fah = (1.8*cen) + 32;
		System.out.println("temp in fahrenhit :" + fah);
		scanner.close();
		}

}
