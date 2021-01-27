
public class CalcTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
//		System.out.println(c.division(6, 2));

		Calculator ac = new AdvancedCalculator();
		System.out.println(ac.division(6, 2));

		System.out.println(ac.a);
		System.out.println(ac.b); // b is overridden still itll show from super

	}
}
