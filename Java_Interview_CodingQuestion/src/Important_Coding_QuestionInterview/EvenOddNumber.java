package Important_Coding_QuestionInterview;

import java.util.Scanner;

// Write a Java program to find odd and even numbers ?

public class EvenOddNumber {
    public static void main(String[] args) {
		
    Scanner Scan = new Scanner(System.in);
    
    System.out.println("Enter the Number.");
    int num = Scan.nextInt();
    
    if (num%2==0) {
    	System.out.println("Number is Even.");
    }
    else {
    	System.out.println("Nuber is Odd.");
    }
    Scan.close();
  }
}
