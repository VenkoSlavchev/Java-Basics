import java.util.Scanner;


public class problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("input a number ");
		int number = input.nextInt();
		if((number%5==0)&&(number%7==0)){
			System.out.println("Yes");}
		else
			System.out.println("No");

	

}
	}
