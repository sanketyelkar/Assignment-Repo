
public class Employee {
	private int eid;
	private String ename;
	private int salary;
	static Employee e;

	private Employee() {
		// TODO Auto-generated constructor stub
	}

	public static Employee getEmployeeObject() {
		if (e == null) {
			e = new Employee();
			return e;
		}
		System.out.print("Only ONce at a time : ");
		return e;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
