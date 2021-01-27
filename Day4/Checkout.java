package OOPAssignment;

public class Checkout {
	private DesertItem[] cashRegister = new DesertItem[10];
	private static int index = 0;
	private int totalNumberOfItems;
	private int totalCost;

	public void enterCashRegister(DesertItem di) {
		cashRegister[index++] = di;
	}

	public void clearCashRegister() {
		if(cashRegister[0]==null) {
			System.err.println("Cart is Empty.......");
			return;
		}
		cashRegister = new DesertItem[10];
		index = 0;
		System.out.println("Items cleared successfully");
	}

	public int getNumberOfItems() {
		if(cashRegister[0]==null) {
			System.err.println("Cart is Empty....");
			return 0;
		}
		for (DesertItem d : cashRegister)
			if (d != null)
				totalNumberOfItems++;
			else
				break;
		return totalNumberOfItems;
	}

	public int getTotalCostOfItems() {
		if(cashRegister[0]==null) {
			System.err.println("Cart is Empty....");
			return 0;
		}
		for (DesertItem d : cashRegister)
			if (d != null)
				totalCost += d.returnCost();
			else
				break;
		return totalCost;
	}

	public String getReceipt() {
		StringBuffer receipt = new StringBuffer("######################## Invoice ########################\n");
		for (DesertItem d : cashRegister)
			if (d != null)
				receipt.append(d + "\n");
			else
				break;
		receipt.append("\nTotal Items: ").append(this.getNumberOfItems());
		receipt.append("\nTotal Cost: ").append(this.getTotalCostOfItems());
		return receipt.toString();
	}

}
