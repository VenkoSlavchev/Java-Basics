import java.util.Scanner;


public class Pr6CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		String[] elements = sentence.split("\\W+");
		int counter = 0;

		for (int i = 0; i < elements.length; i++) {
			if (word.equals(elements[i])) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
