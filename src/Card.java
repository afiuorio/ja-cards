
public abstract class Card<Value> {
	private Value value;
	
	public Card(Value newValue) {
		value = newValue;
	}

	public Value getType() {
		return value;
	}
}
