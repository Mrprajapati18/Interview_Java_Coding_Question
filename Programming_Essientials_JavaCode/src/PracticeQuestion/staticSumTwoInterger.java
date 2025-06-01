package PracticeQuestion;

public class staticSumTwoInterger {

	public static void main(String[] args) {
	 int num1 = 3;
	 int num2 = 5;
	 int result1 = MathOperations.add(num1, num2);
	 System.out.println("The sum is: " + result1);
	 
	 int num3 = 10;
	 int num4 = 20;
	 int result2 = MathOperations.add(num3, num4);
	 System.out.println("The sum is: " + result2);
     
	}
	
   class MathOperations {
	   public static int add(int a , int b) {
		   return a+b;
	     }
	   }
   }

