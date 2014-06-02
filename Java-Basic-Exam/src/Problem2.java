import java.util.ArrayList;
import java.util.Scanner;


public class Problem2 {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	 boolean check = false;
	int number = in.nextInt();
	in.nextLine();
	int[] allNums = new int[number];
	for (int i = 0; i < number; i++) {
		allNums[i]=(in.nextInt());	
	}
	for (int i = 0; i < allNums.length; i++) {
		for (int j = 0; j < allNums.length; j++) {
			for (int j2 = 0; j2 < allNums.length; j2++) {
				if (allNums[i]*allNums[i] + allNums[j]*allNums[j] == allNums[j2]*allNums[j2] && (allNums[i]<=allNums[j])&&(allNums[j]<=allNums[j2])) {
					check = true;
					System.out.printf("%d*%d + %d*%d = %d*%d%n",allNums[i],allNums[i],allNums[j],allNums[j],allNums[j2],allNums[j2]);
				}
				
				}
			}
		}
	if (check==false) {
		System.out.println("No");
	}
	}
	
}

