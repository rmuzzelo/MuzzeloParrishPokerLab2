package PokerBase;

import PokerEnums.eRank;
import PokerEnums.eSuit;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	private ArrayList<Card> cards;
	
	public Deck(){
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		
		for (int n=0; n<=3; n++){
			eSuit SuitValue = eSuit.values()[n];
			for (int i = 0; i<=12; i++){
				eRank RankValue = eRank.values()[i];
				Card NewCard = new Card(SuitValue, RankValue, (13*n)+i+1);
				MakingDeck.add(NewCard);
			}
		}
		cards = MakingDeck;
		ShuffleCards();
	}
	
	private void ShuffleCards(){
		Collections.shuffle(cards);
	}
	
	public Card DrawDeck(){
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}
	
	public int CardsLeft(){
		return cards.size();
	}
	
	public ArrayList<Card> getCards(){
		return this.cards;
	}

}
