
public class EmpTest {

	public void printEmpDetails(Employee employee) {
		System.out.println("EmpID : " + employee.getEid());
		System.out.println("Emp Name : " + employee.getEname());
		System.out.println("Emp Salary : " + employee.getSalary());
	}

	public static void main(String[] args) {
//		Employee employee = new Employee();

		Employee employee = Employee.getEmployeeObject();
		System.out.println(employee);
		employee.setEid(2);
		employee.setEname("Sammy");
		employee.setSalary(35000);
//		new EmpTest().printEmpDetails(employee);

		Employee employee2 = Employee.getEmployeeObject();
		System.out.println(employee2);

		Employee employee3 = Employee.getEmployeeObject();
		System.out.println(employee3);

		// This is employee variable from Employee Class, making this null means we can
		// create new objects in this Singleton Object Project of ours
//		Employee.e = null;

		Employee employee4 = Employee.getEmployeeObject();
		System.out.println(employee4);

	}
}
