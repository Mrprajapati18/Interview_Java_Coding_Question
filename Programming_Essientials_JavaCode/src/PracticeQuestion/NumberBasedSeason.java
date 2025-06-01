package PracticeQuestion;

import java.util.Scanner;

public class NumberBasedSeason {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the month ");
		
		int month = Scan.nextInt();
		
	// print Season Based on the month Number
       switch(month)
       {
//       case 12:
//       case 1:
//       case 2:
//    	   System.out.println("The month number"+month+" "+"Corresponds to winter");
//    	   break;
//       case 3:
//       case 4:
//       case 5:
//    	   System.out.println("The Month number"+month+" "+"Corresponds to Spring");
//    	   break;
//    	   
//       case 6:
//       case 7:
//       case 8:
//    	   System.out.println("The month number"+month+" "+"Corresponds to Summer");
//    	   break;
//    	   
//       case 9:
//       case 10:
//       case 11:
//    	   System.out.println("The month number"+month+" "+"Corresponds to  fall");
//    	   break;
    	   
       case 12,1,2:
    	   System.out.println("The Month number"+month+" "+"Corresponds to Winter");
           break;
           
       case 3,4,5:
    	   System.out.println("The Month number"+month+" "+"Corresponds to Sping");
           break;
           
       case 6,7,8:
    	   System.out.println("The Month number"+month+" "+"Corresponds to Summer");
           break;
           
       case 9,10,11:
    	   System.out.println("The Month number"+month+" "+"Corresponds to Fall");
           break;
       }
       Scan.close();
	}

}
