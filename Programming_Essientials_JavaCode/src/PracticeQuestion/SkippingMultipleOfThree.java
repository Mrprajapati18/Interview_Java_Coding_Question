package PracticeQuestion;

public class SkippingMultipleOfThree {

	public static void main(String[] args) {
		for(int i=1; i<=20;i++) {
			
			if(i%3==0) { // Skipping multiple of 3
				continue;
			}
			System.out.println(i);
		}
	}

}
