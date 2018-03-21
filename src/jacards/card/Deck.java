package jacards.card;
import java.util.Vector;
import java.util.Collections;


public class Deck {
	private Vector<Card> deckList; 
	
	public Deck(Vector<Card> newList) throws Exception {
		if(newList.isEmpty())
			throw new Exception("Deck must not be empty");
		deckList = newList;
	}
	
	public Card FirstCard() {
		return deckList.firstElement();
	}
	
	public Card DrawCard() {
		Card firstCard = FirstCard();
		RemoveCards(1);
		return firstCard;
	}
	
	public void ShuffleDeck() {
		Collections.shuffle(deckList);
	}
	
	private void RemoveCards(int Number) {
		while(Number > 0) {
			deckList.remove(0);
			Number--;
		}
	}
	
	
	
}