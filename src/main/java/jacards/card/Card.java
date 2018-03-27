package main.java.jacards.card;

public abstract class Card {
	private CardValue value;
	
	public Card(CardValue newValue) {
		value = newValue;
	}

	public CardValue getValue() {
		return value;
	}
}
