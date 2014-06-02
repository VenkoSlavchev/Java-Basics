import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] stringNumbersStrings = in.nextLine().split(" ");
		int[] intNumbers = new int[stringNumbersStrings.length];
		for (int i = 0; i < stringNumbersStrings.length; i++) {
			intNumbers[i]=Integer.parseInt(stringNumbersStrings[i]);
		}
		String[]allStrings = new String[stringNumbersStrings.length-1];
		for (int j = 0; j < allStrings.length; j++) {
			allStrings[j]=Integer.toString(intNumbers[j]) + " " + Integer.toString(intNumbers[j+1]);
		}
		Map<String, Integer> numbersCount = new LinkedHashMap<>();
		double numbersLenght = allStrings.length;
		for (String couple:allStrings) {
			Integer count = numbersCount.get(couple);
			if (count==null) {
				count = 0;
				
			}
			numbersCount.put(couple, count+1);
		}
		for (String couple : numbersCount.keySet()) {
			double percentage = ((numbersCount.get(couple)) / numbersLenght )*100;
			System.out.printf("%s -> %.2f%%\n",couple,percentage);
		}
	}
}
