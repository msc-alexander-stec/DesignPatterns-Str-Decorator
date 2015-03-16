package pkg.decorator;

import pkg.component.Pizza;

public class ToopingDecorator implements Pizza {

	protected Pizza tempPizza;

	//
	// Constructor
	//

	public ToopingDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}

	//
	//
	//

	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

}
