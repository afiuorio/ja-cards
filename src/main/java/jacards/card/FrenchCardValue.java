package main.java.jacards.card;

import main.java.jacards.utilities.Tuple;

public class FrenchCardValue extends Tuple<FrenchSeed, Integer> implements CardValue {
	
	public FrenchCardValue(FrenchSeed newSeed, Integer newIntValue) {
		super(newSeed, newIntValue);
	}
	
	public FrenchSeed getFrenchSeed() {
		return this.getX();
	}
	
	public Integer getIntValue() {
		return this.getY();
	}
}
