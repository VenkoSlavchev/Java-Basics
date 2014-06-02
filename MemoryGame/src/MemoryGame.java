import java.util.Random;
import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;


public class MemoryGame {

	private Card[][] board;
	private String[] words = {"Blue","Blue","Green","Green","Red","Red","Yellow","Yellow"};
	private Random rnd;
	private Scanner input;
	
	private MemoryGame(){
		rnd = new Random();
	    input = new Scanner(System.in);
	    board= new Card[4][4];
	    
	    shuffle();
	    setCells();
	    printCells();
	    playGame();
	    
	}
	
	public void playGame(){
		while (!checkTheBoard()) {
			
			choosePairOfCards();	
		}
				
		
	}
	
	

	private boolean checkTheBoard() {
		boolean isFinish = false;
		int counter=0;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col].showing) {
					counter++;
				}
			}
		}
			if (counter==16) {
				isFinish=true;
			}
			return isFinish;		 	
	}

	public void choosePairOfCards(){
		int cardChoise, row1 ,row2, col1, col2;
		System.out.println();
		System.out.println("Enter number on the card.");
		System.out.println("First card choise: ");
		cardChoise = getInputAsInteger();
		row1=cardChoise/4;
		col1=cardChoise%4;
		board[row1][col1].setShowingStatus();
		
		System.out.println("Second card choise: ");
		cardChoise = getInputAsInteger();
		row2=cardChoise/4;
		col2=cardChoise%4;
		board[row2][col2].setShowingStatus();
		
		
		
		//System.out.print('\u000C');  //clears the screen;
		
		printCells();	
		if (board[row1][col1].back.equals( board[row2][col2].back)) {
			board[row1][col1].showing=true;
	
			board[row2][col2].showing=true;
			
			printCells();
		}else{
			board[row1][col1].setShowingStatus();
			board[row2][col2].setShowingStatus();
			printCells();
		}
	}
	
	private int getInputAsInteger() {
		int inputNumber = input.nextInt();
		return inputNumber;
	}

	public void shuffle(){
		for (int i = 0; i < words.length; i++) {
			int pos = rnd.nextInt(words.length);
			String temp = words[i];
			words[i]=words[pos];
			words[pos]=temp;
		}
	}
	
	public void setCells(){
		int number=0;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col]=new Card(words[number], number);
				number++;
				
			}
		}
	}

	public void printCells(){
		Card newCard;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				newCard=board[row][col];
				newCard.showCard();
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new MemoryGame();
	}

}
