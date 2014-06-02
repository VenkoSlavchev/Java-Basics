import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a = input.nextInt();
		System.out.println("Enter second integer: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.printf("%d", sum);

	}

}
