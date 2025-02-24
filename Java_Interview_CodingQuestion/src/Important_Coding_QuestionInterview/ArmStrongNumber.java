package Important_Coding_QuestionInterview;

// Write a Java program to check whether a given number is Armstrong?

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to check the number is Armstrong");
		
		int c=0,a,temp;
		int num = sc.nextInt();
		temp = num;
		
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp == 0) {
			System.out.println(temp+ " is an armstrong number");
		}
		else {
			System.out.println(temp + " is not an  armstrong number");
		}
		sc.close();
	}
}

