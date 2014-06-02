import java.util.Scanner;


public class Pr7CountOfBitOne {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int number = input.nextInt();
	int counter =0;
	String binary = Integer.toBinaryString(number);
	for (int i = 0; i < binary.length(); i++) {
		if ((number&1)==1) {
			counter++;
		}
		number= number>>1;	
	}
	System.out.println(counter);

	}

}
