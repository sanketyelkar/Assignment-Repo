
public class Manager extends EmpSalary {
	private double foodAllowance;
	private double managerAllowance;
	private double otherAllowance;

	public Manager() {

	}

	public Manager(String ename, int basicSalary) {
		super(ename, basicSalary);
		this.foodAllowance = 0.08 * basicSalary;
		this.managerAllowance = 0.1 * basicSalary;
		this.otherAllowance = 0.03 * basicSalary;
	}

	@Override
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + this.foodAllowance + this.managerAllowance
				+ this.otherAllowance;
		this.setGrossSalary(grossSalary); /// Very IMPORTANT
		return grossSalary;
	}

}
