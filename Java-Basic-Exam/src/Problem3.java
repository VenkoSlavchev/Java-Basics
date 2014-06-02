import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;


public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int area = 0;
		int count = 0;		
		String[] snumbers = in.nextLine().split("\\D+");
		int [] numbers = new int[snumbers.length];
		for (int i = 1; i < numbers.length; i++) {
//			if ([i].equals) {
//				
//			}
			numbers[i] = Integer.parseInt(snumbers[i]);
			
		}
		for (int i = 1; i < numbers.length; i+=2) {
			if (i<=numbers.length-5) {
				area = numbers[i] * numbers[i+1] + numbers[i+2]
				* numbers[i+3] + numbers[i+4] * numbers[i+5];
			}
			if (count<=area) {
				count=area;
			}
		}
		System.out.println(count);
	}
}
