package OOPAssignment;

public class Candy extends DesertItem {

	// weight in gms
	private int weight;
	// price per kg
	private int price;

	public Candy() {

	}

	public Candy(String name, int weight) {
		super(name);
		this.weight = weight;
		if(name.equals("Fudge Candy"))
			this.price = 50;
		else
			this.price = 40;
	}

	@Override
	public double returnCost() {
		double res = this.price * this.weight / 1000.0;
		return Math.round(res);
	}
	
	@Override
	public String toString() {
		return "Name: "+this.getName()+" ==> Weight: "+this.weight+" ==> Cost: "+this.returnCost();
	}
}
