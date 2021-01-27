
public class AdvancedCalculator extends Calculator {
	AdvancedCalculator() {

	}

	int b = 200;

	/**
	 * This method calculates factorial of an Integer number
	 * 
	 * @param num is the input integer
	 * @return Returns factorial as Integer value
	 */
	public int fact(int num) {
		int res = 1;
		while (num > 1)
			res *= num--;
		return res;
	}

	public double division(int a, int b) {
//		System.out.println(this.add(a, b));
//		System.out.println(super.division(a, b));
		return a % b;
	}
}
