
public class MarketingExecutive extends EmpSalary {
	double tourAllowance;
	double phoneAllowance;
	double kilos;

	public MarketingExecutive(String ename, int basicSalary, double kilos) {
		super(ename, basicSalary);
		this.phoneAllowance = 1500;
		this.tourAllowance = this.kilos * 5;
	}

	@Override
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + this.tourAllowance + this.phoneAllowance;
		this.setGrossSalary(grossSalary); /// Very IMPORTANT
		return grossSalary;
	}
}
