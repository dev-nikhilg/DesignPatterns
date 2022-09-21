package BuilderPattern;

import java.util.*;

public class Pizza {
	/**
	 * Different pizza toppings
	 * Chicken
	 * Pepperoni
	 * Onion
	 * Tomato
	 * Cheese
	 * Corn
	 * Capsicum
	 * Paneer
	 * Mushrooms
	 */
	
	private boolean chicken;
	private boolean pepperoni;
	private boolean onion;
	private boolean tomato;
	private boolean cheese;
	private boolean corn;
	private boolean capsicum;
	private boolean paneer;
	private boolean mushrooms;
	
	public Pizza(
			boolean chicken,
			boolean pepperoni,
			boolean onion,
			boolean tomato,
			boolean cheese,
			boolean corn,
			boolean capsicum,
			boolean paneer,
			boolean mushrooms) {
		this.chicken = chicken;
		this.pepperoni = pepperoni;
		this.onion = onion;
		this.tomato = tomato;
		this.cheese = cheese;
		this.corn = corn;
		this.capsicum = capsicum;
		this.paneer = paneer;
		this.mushrooms = mushrooms;
	}
	
	@Override
	public String toString() {
		String result;
		List<String> toppings = new ArrayList<>();
		if (cheese) {
			toppings.add("Cheese");
		}
		if (chicken) {
			toppings.add("Chicken");
		}
		if (pepperoni) {
			toppings.add("Pepperoni");
		}
		if (onion) {
			toppings.add("Onion");
		}
		if (tomato) {
			toppings.add("Tomato");
		}
		if (corn) {
			toppings.add("Corn");
		}
		if (capsicum) {
			toppings.add("Capsicum");
		}
		if (paneer) {
			toppings.add("Paneer");
		}
		if (mushrooms) {
			toppings.add("Mushrooms");
		}
		if (toppings.size() > 0) {
			result = "Your pizza is ready with toppings of : " + String.join(", ", toppings) + "!";
		} else {
			result = "Your pizza without any toppings is ready!";
		}
		return result;
	}
}
