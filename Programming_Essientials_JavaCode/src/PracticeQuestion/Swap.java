package PracticeQuestion;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int arr[] = new int[N];
	    
	   // Create the 1D array of size
	    for(int i = 0; i < N; i++) {
	       arr[i] = sc.nextInt();
	    }

	    // Wrirte the code for the reverese the Array
	    int i = 0;  // Starting i from begnning
	    int j = N - 1; // Starting j from end 

	    while(i < j) {
	      // Swap arr[i] and swap arr[j]
	      int temp = arr[i];
	      arr[i] = arr[j];
	      arr[j] = temp;
	     
	      // Update the values of i and j
	      i++;
	      j--;
	    }
	    for(int val: arr) 
	      System.out.println(val + " "); 
	    sc.close();
	  }
	  
	}
