import java.util.Scanner;


public class problem5 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("input a height ");
		long height = input.nextLong();
		System.out.println("input a lenght ");
		long lenght = input.nextLong();
		
		System.out.printf("Area is %d and Perimeter is %d",
				height*lenght,(2*height+2*lenght));

	}

}
