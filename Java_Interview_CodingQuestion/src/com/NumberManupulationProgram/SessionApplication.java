package com.NumberManupulationProgram;

import java.util.Scanner;

public class SessionApplication {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
       System.out.println("Enter number of month");
       int month = Scan.nextInt();
       
       switch(month) {
//       case 12:
//       case 1:
//       case 2:
//    	   System.out.println("The month number"+month+"  corresponding the number is winter ");
//    	   break;
//       case 3:
//       case 4:
//       case 5:	   
//    	  System.out.println("The month Number"+month+"   Corresponding the number is spring "); 
//    	  break;
//       case 6:
//       case 7:
//       case 8:
//    	   System.out.println("the month Number "+month+"  Corresponding the number is Summer");
//    	   break;
//       case 9:
//       case 10:
//       case 11:
//    	   System.out.println("The month Number "+month+"Corresponding the number is fall");
//    	   break;
//      default:
//    	   System.out.println("Invalid Session");
//    	   break;
       case 12,1,2:
    	  System.out.println("The month number" +month+ "Corresponding the number is winter");
    	   break;
    	   
       case 3,4,5:
    	   System.out.println("The month number" +month+  "Corresponding the number is spring");
           break;
       case 6,7,8:
    	   System.out.println("The month Number"+month+  "Corresponding the number is Summer");
           break;
       case 9,10,11:
    	   System.out.println("The Month Number" +month+ "Corresponding  the number is Fall" );
       break;
       
       default:
    	   System.out.println("The month Number"+month+  "Corrresponding the number is Invalid session");
    	   break;
       }
       Scan.close();
	}

}
