package jacards.deck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jacards.card.FrenchCard;
import jacards.card.FrenchCardValue;
import jacards.card.FrenchSeed;
import jacards.deck.Deck;
import jacards.deck.FrenchDeckFactory;
import jacards.exception.WrongFormatException;

class FrenchDeckTests {
	
	private Deck<FrenchCard> deck;

	@Test
	void FactoryOf40() throws WrongFormatException {
		FrenchDeckFactory factory = new FrenchDeckFactory(40);
		deck = factory.createDeck();
		for(FrenchSeed seed : FrenchSeed.values()) {
			for(Integer i=1; i<=10; i++) {
				FrenchCard cardDrawed = deck.DrawCard();
				FrenchCardValue value = cardDrawed.getValue();
				assertEquals(i, value.getIntValue());
				assertEquals(seed, value.getFrenchSeed());
			}
		}
	}
	
	@Test
	void FactoryOf52() throws WrongFormatException {
		FrenchDeckFactory factory = new FrenchDeckFactory(52);
		deck = factory.createDeck();
		for(FrenchSeed seed : FrenchSeed.values()) {
			for(Integer i=1; i<=13; i++) {
				FrenchCard cardDrawed = deck.DrawCard();
				FrenchCardValue value = cardDrawed.getValue();
				assertEquals(i, value.getIntValue());
				assertEquals(seed, value.getFrenchSeed());
			}
		}
	}
	
	@Test
	void WrongFactory() throws WrongFormatException {
		assertThrows(WrongFormatException.class, () -> {
		    new FrenchDeckFactory(41);
		  },"Enter 40 or 52 to select a format for a french deck");
	}
}
