package com.UserInputProgram;

import java.util.Scanner;

public class scannerClass {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter your age");
		byte age = Scan.nextByte();
		
		System.out.println("Enter your year");
		short year = Scan.nextShort();
		
		System.out.println("Enter your Salary");
		int Salary = Scan.nextInt();
		
		System.out.println("Enter your phone");
		long phone = Scan.nextLong();
		
		System.out.println("your age is:"+age);
		System.out.println("your Year is:"+year);
		System.out.println("Your Salary is:"+Salary);
		System.out.println("Your phone is:"+phone);
	}

}
