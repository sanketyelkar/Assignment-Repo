/**
 * EmpSalary Class Learning Inheritance using same Class as used earlier in
 * SampleProject
 * 
 * @author thinkitive
 *
 */
public class EmpSalary {
	private int basicSalary;
	private static int eid;
	private int empid;
	private String ename;
	private double HRA;
	private double PF;
	private int PT;
	private int medicalAllowance;
	private double grossSalary;
	private double netSalary;

	public static void saySomething() {
		System.out.println("Hi");
	}

	public EmpSalary() {
		this.empid = ++eid;
	}

	public EmpSalary(String ename, int basicSalary) {
		this();
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medicalAllowance = 1250;
		this.PT = 200;
		this.HRA = 0.5 * this.basicSalary;
		this.PF = 0.12 * this.basicSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double calculateGrossSalary() {
		this.grossSalary = this.basicSalary + this.HRA + this.medicalAllowance;
		return this.grossSalary;
	}

	public double calculateNetSalary() {
		this.netSalary = this.grossSalary - this.PT - this.PF;
		return this.netSalary;
	}

	public void printEmpDetails() {
		System.out.println("Emp Eid: " + this.empid);
		System.out.println("Emp Name is: " + this.ename);
		System.out.println("Gross Salary is: " + this.calculateGrossSalary());
		System.out.println("Net Salary is: " + this.calculateNetSalary());
		System.out.println();
	}

}
