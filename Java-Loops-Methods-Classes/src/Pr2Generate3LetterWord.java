import java.util.Scanner;


public class Pr2Generate3LetterWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String characters = input.nextLine();
		
		
		
		for (int i = 0; i < characters.length(); i++) {
			for (int j = 0; j < characters.length(); j++) {
				for (int k = 0; k < characters.length(); k++){
					
					System.out.println("" + characters.charAt(i)+characters.charAt(j)+characters.charAt(k));
				}
			}
		}

	}

}
