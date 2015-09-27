package PokerBase;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FullDeckTest {
	
	Deck d;
	Hand c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		d = new Deck();
	}

	@After
	public void tearDown() throws Exception {
		d = null;
	}

	@Test
	public void TestFullDeck() {
		assertTrue("method failed", d.CardsLeft()==52);
	}

}
