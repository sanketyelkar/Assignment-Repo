package OOPAssignment;

public class TestCheckout {
	public static void main(String[] args) {
		Checkout chk = new Checkout();
		DesertItem desertCandy = new Candy("Fudge Candy", 200);
		DesertItem desertCookie = new Cookie("Cookie", 20);
		DesertItem desertIcecream = new Icecream("Chocolate Icecream");
		DesertItem desertSundae = new Sundae("Vanilla Icecream", "Strawberry");
		
		chk.enterCashRegister(desertCandy);
		chk.enterCashRegister(desertCookie);
		chk.enterCashRegister(desertIcecream);
		chk.enterCashRegister(desertSundae);
		
		System.out.println(chk.getReceipt());
		chk.clearCashRegister();
		chk.clearCashRegister();
	}
}
