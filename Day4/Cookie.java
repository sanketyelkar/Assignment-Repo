package OOPAssignment;

public class Cookie extends DesertItem {
	private int units;
	// price per dozen
	private int price;

	public Cookie() {

	}

	public Cookie(String name, int units) {
		super(name);
		this.units = units;
		this.price = 10;
	}

	@Override
	public double returnCost() {
		double res = this.units * this.price / 12.0;
		res *= 10;
		return Math.round(res) / 10.0;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " ==> Units: " + this.units + " ==> Cost: " + this.returnCost();
	}

}
