package BuilderPattern;

public class Builder {
	
	private boolean chicken = false;
	private boolean pepperoni = false;
	private boolean onion = false;
	private boolean tomato = false;
	private boolean cheese = false;
	private boolean corn = false;
	private boolean capsicum = false;
	private boolean paneer = false;
	private boolean mushrooms = false;
	
	public Builder addChicken() {
		chicken = true;
		return this;
	}
	
	public Builder addPepperoni() {
		pepperoni = true;
		return this;
	}
	
	public Builder addCheese() {
		cheese = true;
		return this;
	}
	
	public Builder addOnion() {
		onion = true;
		return this;
	}
	
	public Builder addTomato() {
		tomato = true;
		return this;
	}
	
	public Builder addCorn() {
		corn = true;
		return this;
	}
	
	public Builder addCapsicum() {
		capsicum = true;
		return this;
	}
	
	public Builder addPaneer() {
		paneer = true;
		return this;
	}
	
	public Builder addMushrooms() {
		mushrooms = true;
		return this;
	}
	
	public Pizza bake() {
		return new Pizza(chicken, pepperoni, onion, tomato, cheese, corn, capsicum, paneer, mushrooms);
	}
}
