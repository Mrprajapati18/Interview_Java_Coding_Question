package PracticeQuestion;

import java.util.Scanner;

public class TriangleAndAplphabetPattern {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the nuimber of N ");
		
		int  n  = Scanner.nextInt();
		
		// printing for Alphabet
		for(int i = 1; i <= n; i++) {
			for(char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
       // printing the  Number pattern
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= i ; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
			Scanner.close();
		}
	}

}
