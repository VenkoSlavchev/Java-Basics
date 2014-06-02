import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		System.out.println();
		String[] text = new String[n];
		for(int i = 0; i < text.length; i++) {
			text[i] = input.next();
			
		}
		
		Arrays.sort(text);
		System.out.println(Arrays.toString(text));

	}

}
