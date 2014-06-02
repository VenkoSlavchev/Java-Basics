import java.util.Scanner;


public class Pr5CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split("\\W+");
		System.out.println(words.length);
	}
}
