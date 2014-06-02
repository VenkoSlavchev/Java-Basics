import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;


public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		int hours = 0;
     	int minutes = 0;
     	int min = 0;
     	
     	while(!input.equals("End")){
     		input = in.nextLine(); 
     		if (input.equals("End")) break;
			
     		String [] split = input.split(":");
     		int h = Integer.parseInt(split[0]);
     		int m = Integer.parseInt(split[1]);
     		
     		hours+=h;
     		minutes+=m;
     		
     		input = "";
     		
     	}
     		if (minutes>59) {
				min = minutes%60;
				minutes = minutes/60;
				hours = hours + minutes;
			}
     		else {
				min=minutes;
			}
     		
     		if (min<10) {
				System.out.printf("%d:0%d",hours,min);
			}
     		else {
				System.out.printf("%d:%d",hours,min);
			}
     	
	
	}
}
		
		
		

	


