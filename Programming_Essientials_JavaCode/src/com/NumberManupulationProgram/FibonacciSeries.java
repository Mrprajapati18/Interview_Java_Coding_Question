package com.NumberManupulationProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number of N");
		
		int n = Scan.nextInt();
		// initializing initial 2 values of Fib series
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Fibonacci Series :");
        
		if(n <=0)
		{
			System.out.println("invaild number");
			
		}
		// if n = 1 print num1 ->0
		else if(n == 1) {
			System.out.print(num1+ " ");
		}
		// if n = 2 print num1(0) and num2(1)
		
		else if(n == 2)
		{
			System.out.print(num1+ " "+num2+ " ");
		}
		else {
			
			// first print num1(0) and  num2(1) 
			
			System.out.print(num1+ " "+num2+ " ");
			
			for(int  i = 3; i<=n; i++) {
				
			// calculate next values store in result	
			int res = num1 + num2;
			// assign num2 value to  num1
			num1 = num2;
			// assign res value to num2
			num2 = res;
			
			// print res value for every iteration
			
			System.out.print(res+ " ");
			Scan.close(); 
		}
	}
}
}