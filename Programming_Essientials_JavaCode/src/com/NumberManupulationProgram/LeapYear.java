package com.NumberManupulationProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// creating the object	
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Year");

		int leap = Scan.nextInt();

		// Checking whether the year is a leap year
		if (leap % 4 == 0) {
			// Whether the year is not divisible by 100 or the year is divisible by 400
			if (leap % 100 != 0 || leap % 400 == 0) {
				System.out.println(leap + " is a leap year");
			} else {
				System.out.println(leap + " is not a leap year");
			}
		} else {
			System.out.println(leap + " is not a leap year");
			Scan.close();
		}
	}
}
