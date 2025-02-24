package com.NumberManupulationProgram;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number N");
		int number = Scan.nextInt();
		
		// check the number is perfect square
		int sqrt = (int) Math.sqrt(number);
		
		if( sqrt * sqrt == number) {
			System.out.println(number + " is a perfect square.");
		}else {
			System.out.println(number + " is not a perfect square.");
		}
        Scan.close();
	}

}
