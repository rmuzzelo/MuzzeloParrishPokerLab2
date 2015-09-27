package PokerBase;

import PokerEnums.eSuit;
import PokerEnums.eRank;

import java.util.Comparator;

public final class Card {
	
	private eSuit Suit;
	private eRank Rank;
	
	private Card(){
	}
	
	public Card(eSuit suit, eRank rank, int CardNum){
		this.Suit = suit;
		this.Rank = rank;
	}
	
	public eRank getRank(){
		return Rank;
	}
	
	public eSuit getSuit(){
		return Suit;
	}
	
	public static Comparator<Card> CardRank = new Comparator<Card>(){
		
		public int compare(Card c1, Card c2) {

			   int Cno1 = c1.getRank().getRank();
			   int Cno2 = c2.getRank().getRank();

			   /*For descending order*/
			   return Cno2 - Cno1;
		   }
	};

}
