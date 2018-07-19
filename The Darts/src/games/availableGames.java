package games;

import java.util.ArrayList;

public class availableGames {

	private int gamesCount;
	
	private ArrayList<Game> games;
	
	public availableGames (ArrayList<Game> games) {
		this.games = games;
		this.gamesCount = games.size();
	}
		
	
	
}
