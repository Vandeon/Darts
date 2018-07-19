package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import config.Constants;
import games.GameTenTurns;

public class Main {

	public static void main(String[] args) {

		final String game1 = new String("Ten turns");
		
		List<String> games = new ArrayList<String>();
		games.add(game1);
		
		System.out.println(Constants.GREETINGS);
		printAllGames(games);
		
		Scanner sc = new Scanner(System.in);
		int gameNumber = sc.nextInt();
		
		switch (gameNumber) {
			case 1: 
				startGame1(sc);
				break;
		}

		sc.close();
	}
	
	private static void printAllGames(List<String> games) {
		for(int i = 0; i < games.size(); i++) {
			System.out.println((i + 1) + " - " + games.get(i));
		}
	}
	
	private static void startGame1(Scanner sc) {
		GameTenTurns game = new GameTenTurns();
		sc.nextLine();
		System.out.println("Enter name of first player: ");
		game.setFirstPlayer(sc.nextLine());
		System.out.println("Enter name of second player: ");
		game.setSecondPlayer(sc.nextLine());
		game.start(sc);
	}

}
