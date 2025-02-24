package Important_Coding_QuestionInterview;

import java.util.Scanner;

// Write a Java program to print the entered number in reverse?
public class ReverseNumber {
      public static void main(String[] args) {
		
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Enter the number");
    	  
    	  int num = scan.nextInt();
    	  reverseNumber(num);
    	  
          }
       public static void reverseNumber(int num) {
		
		int reverse = 0;
		while(num!=0) {
			int digit = num%10;
			reverse = reverse *10 + digit;
			num = num/10;
			
		}
		System.out.println("Reverse number: " + reverse);
	}
}
