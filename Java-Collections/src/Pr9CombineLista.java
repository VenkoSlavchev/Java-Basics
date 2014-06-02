import java.util.ArrayList;
import java.util.Scanner;


public class Pr9CombineLista {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> firstList = new ArrayList<Character>();
		ArrayList<Character> secondList = new ArrayList<Character>();
		ArrayList<Character> newList = new ArrayList<Character>();

		for (char ch : in.nextLine().toCharArray()) {
			firstList.add(ch);
		}
		for (char ch : in.nextLine().toCharArray()) {
			secondList.add(ch);
		}
		newList.addAll(firstList);

		for (int i = 0; i < secondList.size(); i++) {
			if (firstList.contains(secondList.get(i))) {
				continue;
			} else {
				newList.add(' ');
				newList.add(secondList.get(i));
			}
		}

		for (int i = 0; i < newList.size(); i++) {
			System.out.print(newList.get(i));
		}
	}
}
