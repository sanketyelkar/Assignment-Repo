/**
 * Test Class Learning Inheritance using same Class as used earlier in
 * SampleProject
 * 
 * @author thinkitive
 *
 */
public class EmpSalaryTest {

	public static void main(String[] args) {
		EmpSalary es = new EmpSalary("Sammy", 35000);
//		es.printEmpDetails();

		Manager m = new Manager("Sanky", 45000);
//		m.printEmpDetails();

		MarketingExecutive mar = new MarketingExecutive("Deku", 36000, 72);
//		mar.printEmpDetails();

		EmpSalary[] empArr = { es, m, mar };
		for (EmpSalary emp : empArr)
			emp.printEmpDetails();

		EmpSalary.saySomething();
		Manager.saySomething();

	}
}
