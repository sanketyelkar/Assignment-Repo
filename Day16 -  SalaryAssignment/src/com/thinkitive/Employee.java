package com.thinkitive;

public class Employee {
	private static int eid;
	private String ename;
	private int basicSalary;
	private int pT;
	private double pF;
	private int medicalAllowance;
	private double HRA;
	private double grossSalary;
	private double netSalary;

	public Employee() {
		this.eid++;
		this.pT = 200;
	}

	public Employee(String ename) {
		this();
		this.ename = ename;
	}

	public Employee(String ename, int basicSalary, int medicalAllowance) {
		this(ename);
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		this.pF = 0.12 * basicSalary;
		this.HRA = 0.5 * basicSalary;
	}
	
	public double calculatePF() {
		this.setpF(0.12 * basicSalary);
		return pF;
	}
	
	public double calculateHra() {
		this.setHRA(0.5 * basicSalary);
		return this.HRA;
	}
	
	public double calculateGrossSalary() {
		this.grossSalary = this.basicSalary + this.calculateHra() + this.medicalAllowance;
		return this.grossSalary;
	}

	public double calculateNetSalary() {
		this.netSalary = this.grossSalary - this.pT - this.calculatePF();
		return this.netSalary;
	}

	public void printEmpDetails() {
		System.out.println("Emp Eid: " + this.eid);
		System.out.println("Emp Name is: " + this.ename);
		System.out.println("Gross Salary is: " + this.calculateGrossSalary());
		System.out.println("Net Salary is: " + this.calculateNetSalary());
		System.out.println();
	}
	
	public static int getEid() {
		return eid;
	}

	public static void setEid(int eid) {
		Employee.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getpT() {
		return pT;
	}

	public void setpT(int pT) {
		this.pT = pT;
	}

	public double getpF() {
		return pF;
	}

	public void setpF(double pF) {
		this.pF = pF;
	}

	public int getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(int medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", basicSalary=" + basicSalary + ", pT=" + pT + ", pF=" + pF
				+ ", medicalAllowance=" + medicalAllowance + ", HRA=" + HRA + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}


}
