import java.util.Scanner;


public class problem11 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("input a number ");
		long number = input.nextLong();
		System.out.println("input a position ");
		long position = input.nextLong();
		long mask= 1<<position;
		
		long getBit = number&mask;
		
		if(getBit == 0)
			System.out.println("0");	
		
		else		
			System.out.println("1");

	}

}
