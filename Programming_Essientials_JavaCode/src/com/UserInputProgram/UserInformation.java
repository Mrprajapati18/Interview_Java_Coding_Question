package com.UserInputProgram;

import java.util.Scanner;

public class UserInformation {
       public static void main(String[] args) {
	   // creation of the object
    	   Scanner Scan = new Scanner (System.in);
    	   
    	   System.out.println("Enter your User Id");
    	   byte user = Scan.nextByte();
    	   
    	   System.out.println("Enter your Age");
    	   short age = Scan.nextShort();
    	   
    	   System.out.println("Enter your phone Number");
    	   int phone = Scan.nextInt();
    	   
    	   System.out.println("Enter your National Id");
    	   long national = Scan.nextLong();
    	   
    	   System.out.println("Enter your Height");
    	   float height = Scan.nextFloat();
    	   
    	   System.out.println("Enter your Weight");
    	   double weight = Scan.nextDouble();
    	   
    	   System.out.println("Enter your Gender");
    	   char gender = Scan.next().charAt(0);
    	   
    	   System.out.println("Are you married");
    	   boolean married = Scan.nextBoolean();
    	   
    	   System.out.println("Enter your Name");
    	   String name = Scan.nextLine();
    	   
    	   
    	   System.out.println("User Id is:"+user);
    	   System.out.println("Age is:"+age);
    	   System.out.println("phone number is:"+phone);
    	   System.out.println("National Id is:"+national);
    	   System.out.println("Height is:"+height);
    	   System.out.println("Weight is:"+weight);
    	   System.out.println("Gender is:"+gender);
    	   System.out.println("Are you married:"+married);
    	   System.out.println("Enter your name:"+name);
    	   
    	   Scan.close();
   }
}
