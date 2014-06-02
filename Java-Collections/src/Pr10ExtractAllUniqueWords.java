import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;


public class Pr10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] text = in.nextLine().toLowerCase().split("\\W+");
		Set<String> newSet = new TreeSet<>();
		for (String word : text) {
			newSet.add(word);
		}

		for (String word : newSet) {
			System.out.print(word + " ");
		}
	}
}
