package PracticeQuestion;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the year");
		
		int year = Scan.nextInt();
		// Checking weather year divisible by 4
		if(year%4==0) 
		{
			if(year%100!=0 || year%400 ==0) 
			{
				System.out.println(year+" "+"is leap year");
			}
			else
			{
				System.out.println(year+" "+"is not leap year");
				Scan.close();
			}
		}

	}

}
