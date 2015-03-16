package pkg.component.concrete;

import pkg.component.Pizza;

public class PizzaPlain implements Pizza {

	public PizzaPlain() {
		System.out.println("Constructor: PizzaPlain");
	}
	
	@Override
	public String getDescription() {
		return "getDescription: PizzaPlain";
	}

	@Override
	public double getCost() {
		System.out.println("getCost: PizzaPlain: 4.00");
		return 4.00;
	}

}