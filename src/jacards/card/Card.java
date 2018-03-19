package jacards.card;

public abstract class Card<Value> implements Valueable<Value> {
	private Value value;
	
	public Card(Value newValue) {
		value = newValue;
	}

	@Override
	public Value getValue() {
		return value;
	}
}
