import java.util.Scanner;


public class problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a number ");
		long number = input.nextLong();
		long reminder=0;
		reminder=number/100;
		if(reminder%7==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

