package games;

import java.util.Scanner;

public class GameTenTurns {

	private String rules = "Two players are throwing 3 darts 2 times suborder.";
	
	private int playerOneScore = 0;
	
	private int playerTwoScore = 0;
	
	public GameTenTurns () {} 
	
	public void printRules() {
		System.out.println(rules);
	}
	
	public void start(Scanner sc) {
		int step = 0;
		System.out.println("First player starts!");
		
		while(step < 10) {
			System.out.println("First player first 3 darts summary");
			playerOneScore += sc.nextInt();
			System.out.println("First player second 3 darts summary");
			playerOneScore += sc.nextInt();
			step++;

			System.out.println("Second player first 3 darts summary");
			playerTwoScore += sc.nextInt();
			System.out.println("Second player second 3 darts summary");
			playerTwoScore += sc.nextInt();
			step++;
		}
		if(playerOneScore > playerTwoScore) System.out.println("First player wins!");
		else if(playerOneScore < playerTwoScore) System.out.println("First player wins!");
		else System.out.println("Friendship wins!");
	}
	
}
