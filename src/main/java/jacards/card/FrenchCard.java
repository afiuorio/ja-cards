package main.java.jacards.card;

public class FrenchCard extends Card {

	public FrenchCard(FrenchCardValue newValue) {
		super(newValue);
	}
	
	@Override
	public FrenchCardValue getValue() {
		return (FrenchCardValue) super.getValue();
		
	}
}
