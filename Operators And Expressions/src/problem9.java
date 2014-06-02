import java.util.Scanner;


public class problem9 {

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
					
		System.out.println("input x ");
		long x = input.nextLong();
		System.out.println("input y ");
		long y = input.nextLong();
		
		if(((x*x+y*y)<=25)&&(x<-1||x>5||y<1||y>5))
			System.out.println("The point is inside"
					+ " the Circle and outside the Rectangle");
		else
			System.out.println("The point is not inside"
					+ " the Circle and outside the Rectangle");

	}

}
