import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	
	System.out.println("input a number: ");
	int a = input.nextInt();
	if(a%2==0){
		System.out.println("The number is even");
	} 
	else
		System.out.println("The number is odd");
	

	}

}
