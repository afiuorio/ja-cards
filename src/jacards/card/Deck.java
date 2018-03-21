package jacards.card;
import java.util.LinkedList;
import java.util.Collections;


public class Deck {
	private LinkedList<Card> deckList; 
	
	public Deck(LinkedList<Card> newList) {
		deckList = newList;
	}
	
	public Card FirstCard() {
		return deckList.getFirst();
	}
	
	public Card DrawCard() {
		return deckList.pop();
	}
	
	public void ShuffleDeck() throws Exception {
		if(deckList.isEmpty())
			throw new Exception("You can't shuffle an empty deck");
			
		Collections.shuffle(deckList);
	}
	
	public void AddCard(Card newCard) {
		deckList.add(newCard);
	}
	
	
	
}