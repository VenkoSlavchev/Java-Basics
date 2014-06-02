import java.util.Scanner;


public class problem10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a number ");
		int number = input.nextInt();
		int fourthDigit = number%10;
		number/=10;
		int thirdDigit = number%10;
		number/=10;
		int secondDigit = number%10;
		number/=10;
		int firstDigit = number%10;
		
		System.out.printf("The sum is %d \n",firstDigit+secondDigit
				+thirdDigit+fourthDigit);
		System.out.printf("%d %d %d %d \n",fourthDigit,thirdDigit,
				secondDigit,firstDigit);
		System.out.printf("%d %d %d %d \n",fourthDigit,firstDigit,
				secondDigit,thirdDigit);
		System.out.printf("%d %d %d %d \n",firstDigit,thirdDigit,
				secondDigit,fourthDigit);
		

	}

}
