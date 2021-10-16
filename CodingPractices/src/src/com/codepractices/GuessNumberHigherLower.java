package src.com.codepractices;

public class GuessNumberHigherLower {

	public static void main(String[] args) {
		GuessNumber(15);
	}
	
	public static void GuessNumber(int number) {
		
		
		for(int i=1;i<number;i++) {
			if(i==number) {
				System.out.println("Number is  " + number);
			
			}
		}
		
	}
		
}
