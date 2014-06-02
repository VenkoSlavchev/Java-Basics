import java.util.Scanner;


public class problem8 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("input x ");
		long x = input.nextLong();
		System.out.println("input y ");
		long y = input.nextLong();
		
		if((x*x+y*y)<=25)
			System.out.println("The point is inside the Circle");
		else
			System.out.println("The point is outside the Circle");




	}

}
