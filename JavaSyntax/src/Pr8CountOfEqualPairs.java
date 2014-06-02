import java.util.Scanner;


public class Pr8CountOfEqualPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		String binary = Integer.toBinaryString(number);
		int counter = 0;
		for (int i = 0; i < binary.length(); i++) {
			if((number&3)==3){
				counter++;
			}else if ((number&3)==00) {
				counter++;
			}
			number=number>>1;
		}
System.out.println(counter);
	}

}
