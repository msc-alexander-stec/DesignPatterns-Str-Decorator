package testclient;

import pkg.component.Pizza;
import pkg.component.concrete.PizzaPlain;
import pkg.decorator.concrete.Mozzarella;
import pkg.decorator.concrete.TomatoSauce;

/*
 * See:
 * http://www.philipphauer.de/study/se/design-pattern/decorator.php
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Decorator");

		// Execute at first PlainPizza then Mozzarella then TomatoSauce

		Pizza basicPizza = new PizzaPlain(); // Step 1
		basicPizza = new Mozzarella(basicPizza); // Step 2
		basicPizza = new TomatoSauce(basicPizza); // Step 3

		// The three steps above can be also executed in one line, e.g.:
		// Pizza basicPizza = new TomatoSauce(new Mozzarella(new PizzaPlain()));

		System.out.println("Description: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());

	}

}