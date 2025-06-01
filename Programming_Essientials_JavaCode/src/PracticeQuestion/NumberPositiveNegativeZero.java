package PracticeQuestion;

import java.util.Scanner;

public class NumberPositiveNegativeZero {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Emetr the number");
		int n = Scan.nextInt();
		
		// Checking weather number is positive
		if(n>0) 
		{
			System.out.println(n+ " "+"Number is Positive");
		}
		else if(n<0) 
		{
			System.out.println(n+" "+"Number is Negative");
		}
		else 
		{
			System.out.println(n+" "+"umber is Zero");
			Scan.close();
		}
	}

}
