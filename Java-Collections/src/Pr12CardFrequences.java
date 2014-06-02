import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr12CardFrequences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] cards = in.nextLine().split("[♥♣♦♠ ]+");
		int N = cards.length;
		
		Map<String, Integer> cardOccurrences = new LinkedHashMap<String, Integer>();

		for (String card : cards) {
			Integer count = cardOccurrences.get(card);
			if (count == null)
				count = 0;
			cardOccurrences.put(card, count + 1);
		}

		
		for (Map.Entry<String, Integer> entry : cardOccurrences.entrySet()) {
			System.out.printf("%s -> %.2f%%\n", entry.getKey(),
					(double) entry.getValue() * 100 / N);

		}
	}
}
