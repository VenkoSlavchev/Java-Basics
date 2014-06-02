import java.util.Scanner;


public class Pr6FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = input.nextInt();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		String hex = Integer.toHexString(number1).toUpperCase();
		String binary = String.format("%10s", Integer.toBinaryString(number1)).replace(' ', '0');
		
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,binary,number2,number3);

	}

}
