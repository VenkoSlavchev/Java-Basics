import java.lang.reflect.Array;
import java.util.Scanner;


public class Pr1SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
		int lastNumber = input.nextInt();
		input.nextLine();
		
		for (int i = firstNumber; i <= lastNumber; i++) {
			   String numberString =  Integer.toString(i);
			   boolean symetric = true;
			     for (int j = 0; j < numberString.length()/2; j++) {
				     char[] numberArray = numberString.toCharArray();
					if (numberArray[j] != numberArray[numberArray.length-j-1]) {
						symetric = false;
					}
				}
			     if (symetric) {
			    	 System.out.println(i);
			    	 
				 }
			
			
		}
		
	}

}
