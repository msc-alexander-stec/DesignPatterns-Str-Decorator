package pkg.decorator.concrete;

import pkg.component.Pizza;
import pkg.decorator.ToopingDecorator;

public class TomatoSauce extends ToopingDecorator {

	//
	// Constructor
	//

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);

		System.out.println("Constructor: TomatoSauce");
	}

	//
	//
	//

	@Override
	public String getDescription() {
		extendedBehavior();
		return tempPizza.getDescription() + ", getDescription: Tomato Sauce";
	}

	@Override
	public double getCost() {
		System.out.println("getCost: TomatoSauce: 0.35");
		return tempPizza.getCost() + .35;
	}

	//
	// Extended behavior
	//

	private void extendedBehavior() {
		System.out
				.println("Extended behavior of Mozzarella: Do something here");
	}
}
