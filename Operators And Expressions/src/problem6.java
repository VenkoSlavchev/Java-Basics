import java.util.Scanner;


public class problem6 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("input a ");
		long a = input.nextLong();
		System.out.println("input b ");
		long b = input.nextLong();
		System.out.println("input a height ");
		long height = input.nextLong();
		
		System.out.printf("Area is %d ",
				((a+b)*height)/2);


	}

}
