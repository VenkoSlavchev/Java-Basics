import java.util.Scanner;


public class Pr4TheSmallestOf3 {

	public static void main(String[] args) {
Scanner	input = new Scanner(System.in);
        
	    double number1 = input.nextDouble();
	    double number2 = input.nextDouble();
	    double number3 = input.nextDouble();
	    input.nextLine();

	    double min = number1;
	    if (number2<=min) {
			min=number2;
		}
	    if (number3<=min) {
			min=number3;
		}
	    
	    System.out.println(min);
	}

}
