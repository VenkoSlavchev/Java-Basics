import java.util.Scanner;


public class problem4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("input a number ");
		long number = input.nextLong();
		if((number>>2&1)==0)
			System.out.println("0");
		else
			System.out.println("1");

	}

}
