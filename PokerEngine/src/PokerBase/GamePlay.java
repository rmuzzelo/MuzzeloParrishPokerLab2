package PokerBase;

import java.util.ArrayList;
import java.util.UUID;


public class GamePlay {
	private UUID GameID;
	private int MaxNbrOfPlayers;
	
	public int GetMaxNumberOfPlayers(){
		return this.MaxNbrOfPlayers;
	}
	
	public UUID GetGameID(){
		return this.GameID;
	}
	public static void Play(){
		Deck d= new Deck();
		//create array list of hands
		ArrayList<Hand> hands= new ArrayList<Hand>();
		//creates three hands for the poker game
			for (int n=1; n < 4; n++){
				Hand h = new Hand(d);
				hands.add(h);
			}
		for (int i=0; i<3; i++){
			hands.get(i).EvalHand();
		}
		
	}
}
		
	

	


