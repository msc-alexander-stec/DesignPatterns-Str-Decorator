package pkg.decorator.concrete;

import pkg.component.Pizza;
import pkg.decorator.ToopingDecorator;

public class Mozzarella extends ToopingDecorator {

	//
	// Constructor
	//
	
	public Mozzarella(Pizza newPizza) {
		super(newPizza);

		System.out.println("Constructor: Mozzarella");
	}

	//
	//
	//
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription() + ", getDescription: Mozzarella";
	}

	@Override
	public double getCost() {
		System.out.println("getCost: Mozzarella: 0.50");
		return tempPizza.getCost() + .50;
	}
	
}
