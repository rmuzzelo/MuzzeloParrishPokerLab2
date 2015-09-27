package PokerBase;
import java.util.ArrayList;
import PokerEnums.eRank;
import PokerEnums.eSuit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEvalMethods {

	ArrayList<Card> d=new ArrayList<Card>();

	@Before
	public void setUp() throws Exception {
		Card c1=new Card(eSuit.CLUBS,eRank.TWO, 0);
		Card c2=new Card(eSuit.HEARTS,eRank.TWO,1);
		Card c3=new Card(eSuit.DIAMONDS,eRank.TWO,2);
		Card c4=new Card(eSuit.SPADES,eRank.TWO,3);
		Card c5=new Card(eSuit.CLUBS,eRank.FOUR,4);
		d.add(c1);
		d.add(c2);
		d.add(c3);
		d.add(c4);
		d.add(c5);
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
