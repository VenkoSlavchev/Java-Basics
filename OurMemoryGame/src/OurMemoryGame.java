import java.awt.SecondaryLoop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class OurMemoryGame {
	
	
	
public static void main(String[] args) {
	int row =2;
	int col=2;
	String[][] boardForPrint = new String[row][col];
	String[][] boardWithNumbers = new String[row][col];
	Boolean[][] boardWithBools = new Boolean[row][col];
	ArrayList<String> numbers = new ArrayList<>();
	numbers.add("[1]");
	numbers.add("[2]");
	numbers.add("[3]");
	numbers.add("[4]");
	String[][] board = new String[row][col];
	ArrayList<String> words = new ArrayList<>();
	words.add("pink");
	words.add("red");
	words.add("pink");
	words.add("red");
	int counter=0;
	Random r = new Random();
	int count = 0;
	int row1;
	int col1;
	int row2;
	int col2;
	
		
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			int randomElement = r.nextInt(words.size());
			board[i][j]=words.get(randomElement);
			words.remove(randomElement);
		}		 
	}
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			boardWithBools[i][j] = false;
		}		 
	}
	
	
	
	words.add("pink");
	words.add("red");
	words.add("pink");
	words.add("red");
	
	
	
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			
			boardWithNumbers[i][j]=numbers.get(count);
			count++;
		}		 
	}
	count = 0;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			
			boardForPrint[i][j]=numbers.get(count);
			count++;
		}		 
	}

	while(counter != numbers.size()/2) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%10s",boardWithNumbers[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Enter position");
		Scanner scan = new Scanner(System.in);
		int firstNumber = scan.nextInt();

		row1=(firstNumber-1)/(2);
		col1=(firstNumber-1)%(2);
		
		while(boardWithBools[row1][col1]) {
			System.out.println("Enter diffent number");
			firstNumber = scan.nextInt();
			row1=(firstNumber-1)/(2);
			col1=(firstNumber-1)%(2);
		}
		
		boardWithBools[row1][col1] = true;
		
		String temp = board[row1][col1];
		boardForPrint[row1][col1] = temp;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%10s", boardForPrint[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("Enter second possition");
		int secondNumber = scan.nextInt();

		row2=(secondNumber-1)/(2);
		col2=(secondNumber-1)%(2);
		while(boardWithBools[row2][col2]) {
			System.out.println("Enter diffent number");
			secondNumber = scan.nextInt();
			row2=(secondNumber-1)/(2);
			col2=(secondNumber-1)%(2);
		}
//		
		
		//use already used temp!
		temp = board[row2][col2];
		boardForPrint[row2][col2] = temp;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%10s", boardForPrint[i][j]);
			}
			System.out.println();
		}
		
		if(board[row1][col1].equals(board[row2][col2])) {
			boardWithNumbers[row1][col1] = board[row1][col1];
			boardWithNumbers[row2][col2] = board[row2][col2];
			boardWithBools[row1][col1] = true;
			boardWithBools[row2][col2] = true;
			counter++;
		} else {
			boardForPrint[row1][col1] = boardWithNumbers[row1][col1];
			boardForPrint[row2][col2] = boardWithNumbers[row2][col2];
			boardWithBools[row1][col1] = false;
			boardWithBools[row2][col2] = false;
		}
		
		if(counter == numbers.size()/2) {
			System.out.println("Congrats, you WIN");
		}
		
		System.out.println();	
		
	}
	
	

		
	
}
}
