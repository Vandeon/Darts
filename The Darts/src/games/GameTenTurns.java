package games;

import java.util.Scanner;

import config.Constants;

public class GameTenTurns {

	private String rules = Constants.RULE_TEN_TURNS;
	
	private int playerOneScore = 0;
	
	private int playerTwoScore = 0;
	
	private String firstPlayer = "First player";
	
	private String secondPlayer = "Second player";
	
	public GameTenTurns () {} 
	
	public void printRules() {
		System.out.println(rules);
	}
	
	public void setFirstPlayer(String firstPlayer) {;
		if(firstPlayer.length() != 0) this.firstPlayer = firstPlayer;
	}

	public void setSecondPlayer(String secondPlayer) {
		if(firstPlayer.length() != 0) this.secondPlayer = secondPlayer;
	}

	public void start(Scanner sc) {
		int step = 0;
		System.out.println("The game is started. Good luck!");
		
		while(step < 10) {
			System.out.println(firstPlayer + Constants.FIRST_SUMMARY);
			playerOneScore += sc.nextInt();
			System.out.println(firstPlayer + Constants.SECOND_SUMMARY);
			playerOneScore += sc.nextInt();
			step++;

			System.out.println(secondPlayer + Constants.FIRST_SUMMARY);
			playerTwoScore += sc.nextInt();
			System.out.println(secondPlayer + Constants.SECOND_SUMMARY);
			playerTwoScore += sc.nextInt();
			step++;
			
			System.out.println(firstPlayer + ": " + playerOneScore);
			System.out.println(secondPlayer + ": " + playerTwoScore);
		}
		
		if(playerOneScore > playerTwoScore) System.out.println(firstPlayer + " wins!");
		else if(playerOneScore < playerTwoScore) System.out.println(secondPlayer + " wins!");
		else System.out.println("Friendship wins!");

		playerOneScore = 0;
		playerTwoScore = 0;
	}
	
}
