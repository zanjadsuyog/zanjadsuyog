package Test6;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private Department dept;

	public Employee() {

	}

	public Employee(int empId, String empName, double salary, Department dept) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee:" + " " + empId + " " + empName + " " + salary + " " + dept;
	}
}
