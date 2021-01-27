/**
 * This is Calculator Class used for teaching Inheritance
 * 
 * @author sanketsy
 *
 */
public class Calculator {
	Calculator() {

	}

	int a = 10;
	int b = 20;

	/***
	 * This method adds two int values
	 * 
	 * @param a is 1st int parameter
	 * @param b is 2nd int parameter
	 * @return It returns the addition of a and b as int
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts two int values
	 * 
	 * @param a is 1st parameter
	 * @param b is 2nd parameter
	 * @return Returns subtraction of a and b as int value
	 */
	public int sub(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplies two integers
	 * 
	 * @param a is 1st value
	 * @param b is 2 value
	 * @return Returns multiplication of a and b as int value
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Division of two integers
	 * 
	 * @param a is 1st int value
	 * @param b is 2nd int value
	 * @return Returns division result of a and b as double
	 */
	public double division(int a, int b) {
		return a / b;
	}
}
