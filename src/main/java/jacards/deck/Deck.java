package jacards.deck;

import java.util.LinkedList;
import java.util.Collections;


public class Deck<CardType> {
	private LinkedList<CardType> deckList = new LinkedList<CardType>();

	
	public CardType FirstCard() {
		return deckList.getFirst();
	}
	
	public CardType DrawCard() {
		return deckList.pop();
	}
	
	public void ShuffleDeck() {
		Collections.shuffle(deckList);
	}
	
	public void AddCardTop(CardType newCard) {
		deckList.addFirst(newCard);
	}
	
	public void AddCardBottom(CardType newCard) {
		deckList.addLast(newCard);
	}
	
	
	
	
}