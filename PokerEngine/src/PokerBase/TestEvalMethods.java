package PokerBase;

import java.util.ArrayList;
import java.util.Arrays;
import PokerEnums.eRank;
import PokerEnums.eSuit;
import PokerEnums.eCardNo;
import PokerEnums.eHandStrength;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEvalMethods {

	
		ArrayList<Card> FourOfAKindCard = new ArrayList(
				Arrays.asList(new Card(eSuit.CLUBS,eRank.TWO, 0),
				new Card(eSuit.HEARTS,eRank.TWO,1),
				new Card(eSuit.DIAMONDS,eRank.TWO,2),
				new Card(eSuit.SPADES,eRank.TWO,3),
				new Card(eSuit.CLUBS,eRank.FOUR,4)));
		Hand testFourofAKind = new Hand (FourOfAKindCard);
		
		ArrayList<Card> FullHouseCard = new ArrayList(
				Arrays.asList(new Card(eSuit.CLUBS,eRank.TWO, 0),
				new Card(eSuit.HEARTS,eRank.TWO,1),
				new Card(eSuit.DIAMONDS,eRank.TWO,2),
				new Card(eSuit.SPADES,eRank.FOUR,3),
				new Card(eSuit.CLUBS,eRank.FOUR,4)));
		Hand testFullHouse = new Hand (FullHouseCard);	
		
		ArrayList<Card> ThreeOfAKindCard = new ArrayList(
				Arrays.asList(new Card(eSuit.CLUBS,eRank.TWO, 0),
				new Card(eSuit.HEARTS,eRank.TWO,1),
				new Card(eSuit.DIAMONDS,eRank.TWO,2),
				new Card(eSuit.SPADES,eRank.THREE,3),
				new Card(eSuit.CLUBS,eRank.FOUR,4)));
		Hand testThreeofAKind = new Hand (ThreeOfAKindCard);
		
		ArrayList<Card> TwoPairCard = new ArrayList(
				Arrays.asList(new Card(eSuit.CLUBS,eRank.TWO, 0),
				new Card(eSuit.HEARTS,eRank.TWO,1),
				new Card(eSuit.DIAMONDS,eRank.FIVE,2),
				new Card(eSuit.SPADES,eRank.FOUR,3),
				new Card(eSuit.CLUBS,eRank.FOUR,4)));
		Hand testTwoPair = new Hand (TwoPairCard);	
		
		ArrayList<Card> PairCard = new ArrayList(
				Arrays.asList(new Card(eSuit.CLUBS,eRank.TWO, 0),
				new Card(eSuit.HEARTS,eRank.TWO,1),
				new Card(eSuit.DIAMONDS,eRank.FIVE,2),
				new Card(eSuit.SPADES,eRank.FOUR,3),
				new Card(eSuit.CLUBS,eRank.SIX,4)));
		Hand testPair = new Hand (PairCard);	

	

	@Test
	public void TestFourOfAKindHand() {
		testFourofAKind.EvalHand();
		assertTrue("Method doesn't work", testFourofAKind.getHandStrength()==80);
		assertTrue("Method doesn't work", testFourofAKind.getKicker()==4);
	}
	
	@Test
	public void TestFullHouseHand() {
		testFullHouse.EvalHand();
		assertTrue("Method doesn't work", testFullHouse.getHandStrength()==70);
	}
	
	@Test
	public void TestThreeOfAKindHand() {
		testThreeofAKind.EvalHand();
		assertTrue("Method doesn't work", testThreeofAKind.getHandStrength()==40);
	}
	
	@Test
	public void TestTwoPairHand() {
		testTwoPair.EvalHand();
		assertTrue("Method doesn't work", testTwoPair.getHandStrength()==30);
		assertTrue("Method doesn't work", testTwoPair.getHighPairStrength()==4);
		assertTrue("Method doesn't work", testTwoPair.getLowPairStrength()==2);
		assertTrue("Method doesn't work", testTwoPair.getKicker()==5);
	}
	@Test
	public void TestPairHand() {
		testPair.EvalHand();
		assertTrue("Method doesn't work", testPair.getHandStrength()==20);
		assertTrue("Method doesn't work", testPair.getKicker()==6);
	}

}
