package jacards.deck;

import jacards.card.FrenchCard;
import jacards.card.FrenchCardValue;
import jacards.card.FrenchSeed;
import jacards.exception.WrongFormatException;

public class FrenchDeckFactory implements DeckFactory{
	
	private int format;
	
	public FrenchDeckFactory(int newFormat) throws WrongFormatException {
		if(newFormat!=40 || newFormat!=52)
			throw new WrongFormatException("Enter 40 or 52 to select a format for a french deck");
		format=newFormat;
	}

	@Override
	public Deck<FrenchCard> createDeck() {
		Deck<FrenchCard> frenchDeck = new Deck<FrenchCard>();
		int count = 0;
		switch(format) {
			case 40: 
				count=10; 
				break;
			
			case 52:
				count=13;
				break;
		}
			
		for(FrenchSeed seed : FrenchSeed.values()) {
			for(int i=1; i<=count; i++) {
				
				frenchDeck.AddCardBottom(new FrenchCard(new FrenchCardValue(seed,i)));
			}
		}
		return frenchDeck;
	}

}
