package src.com.codepractices;

public class CountEvenNoDigitsinNumber {

	public static void main(String[] args) {
		int[] arr= {12,342,4567,1,234,23,12345};
		getevenNumber(arr);
		
	}
	
	
	static void getevenNumber(int num[]) {
		int countEven=0,countOdd=0;
		int countDigit;
		for (int i = 0; i < num.length; i++) {
			int j = num[i];
			
			countDigit= countDigitNumber(j);
			if(countDigit % 2==0) {
				countEven++;
			}else
				countOdd++;
			
		}
		
		System.out.println("No of even Digits " +countEven );
		System.out.println("No of odd Digits " +countOdd );
		
	}
	
	static int countDigitNumber(int num) {
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
		
	}

}
