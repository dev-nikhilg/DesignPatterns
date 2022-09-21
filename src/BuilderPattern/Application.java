package BuilderPattern;

public class Application {

	public static void main(String[] args) {
		// Let's create a chicken pizza using new operator
		Pizza chickenPizza = new Pizza(true, false, false, false, false, false, false, false, false);
		System.out.println(chickenPizza);
				
		// Let's create a veggie cheese pizza using new operator
		Pizza veggieCheesePizza = new Pizza(false, false, true, true, true, true, true, true, true);
		System.out.println(veggieCheesePizza);
				
		// Let's create a cheese chicken pizza using Builder
		Builder cheeseChickenPizzaBuilder = new Builder();
		cheeseChickenPizzaBuilder.addCheese();
		cheeseChickenPizzaBuilder.addChicken();
		Pizza cheeseChickenPizza = cheeseChickenPizzaBuilder.bake();
		System.out.println(cheeseChickenPizza);
				
		// Let's create a cheese chicken pizza using Builder method chaining
		Pizza newCheeseChickenPizza = new Builder().addCheese().addChicken().bake();
		System.out.println(newCheeseChickenPizza);	
				
		// Let's create an all veggie pizza using Director
		Builder allVeggiePizzaBuilder = new Builder();
		Director allVeggiePizzaDirector = new Director(allVeggiePizzaBuilder);
		allVeggiePizzaDirector.createAllVeggiePizza();
		Pizza allVeggiePizza = allVeggiePizzaBuilder.bake();
		System.out.println(allVeggiePizza);
	}

}
