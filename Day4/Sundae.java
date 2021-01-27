package OOPAssignment;

public class Sundae extends Icecream {
	private int toppingsCost;
	private String toppings;

	public Sundae() {

	}

	public Sundae(String name, String toppings) {
		super(name);
		this.toppings = toppings;
		if (toppings.equals("Chocolate"))
			this.toppingsCost = 20;
		if (toppings.equals("Strawberry"))
			this.toppingsCost = 25;
		else
			this.toppingsCost = 10;
	}

	@Override
	public double returnCost() {
		double res = super.returnCost() + this.toppingsCost;
		return res;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " ==> Toppings: " + this.toppings + " ==> Cost: " + this.returnCost();
	}

}
