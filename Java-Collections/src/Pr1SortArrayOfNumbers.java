import java.util.Arrays;
import java.util.Scanner;

public class Pr1SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numbers = in.nextInt();
		in.nextLine();
		int[] arrayOfNumbers = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			arrayOfNumbers[i] = in.nextInt();
		}
		Arrays.sort(arrayOfNumbers);

		for (int i = 0; i < numbers; i++) {
			System.out.print(arrayOfNumbers[i]);
		}
	}

}
