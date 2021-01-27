package OOPAssignment;

public class Icecream extends DesertItem {
	private int price;

	public Icecream() {

	}

	public Icecream(String name) {
		super(name);
		if (name.equals("Chocolate Icecream"))
			this.price = 40;
		else if (name.equals("Vanilla Icecream"))
			this.price = 35;
		else
			this.price = 20;
	}

	@Override
	public double returnCost() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " ==> Cost: " + this.returnCost();
	}

}
