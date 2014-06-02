import java.util.Random;
import java.util.Scanner;




public class Pr6RandomHands {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
         int number = input.nextInt();
		 
		 char[] colour = new char[]{'\u2663','\u2666','\u2660','\u2665'};
		 String[] cardsString = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		 Random rand = new Random();
		 for (int i = 0; i < number; i++) {
 
			 for (int j = 0; j<5 ;j++) {
				 int car = rand.nextInt(12)+1;
				 int suit = rand.nextInt(3)+1;
																 
	           System.out.printf("%s%c",cardsString[car],colour[suit]);
	             
			 }  
			 System.out.printf("%n");
		}
		 
                     

	

	 }
}

