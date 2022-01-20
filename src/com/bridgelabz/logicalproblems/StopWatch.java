package com.bridgelabz.logicalproblems;

import java.util.Scanner;

public class StopWatch {

	

	public static void main(String[] args)
	{
		System.out.println("Press 1 to start the stopwatch" );
		
		Scanner scanner = new Scanner(System.in); 
		int input=scanner.nextInt();
		long startTime=0,stopTime = 0;
		
		if(input==1)
		{
			 startTime = System.currentTimeMillis();
		}
		
		System.out.println("Press 2 to stop the stopwatch ");
		input=scanner.nextInt();
		
		if(input==2)
		{
			 stopTime = System.currentTimeMillis();
		}
		
		long timeElapsed = stopTime-startTime;
		System.out.println("Time elapsed in millisecond is :"+timeElapsed);
		

	}
}