import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr3LargestSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] elements = str.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0; 
		
		
		for (int i = 1; i < elements.length; i++) {
			if (elements[i].equals(elements[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfWord = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(elements[positionOfWord] + " ");
		}
		System.out.println(elements[positionOfWord]);
	}

}
