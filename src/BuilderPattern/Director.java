package BuilderPattern;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Builder createAllVeggiePizza() {
		builder
			.addOnion()
			.addTomato()
			.addCorn()
			.addCapsicum()
			.addPaneer()
			.addMushrooms();
		return builder;
	}
	
	public Builder createCheeseChickenPizza() {
		builder.addCheese().addChicken();
		return builder;
	}
}
