package com.EmployeeClass;

public class EmployeeC {
	private int empId;
	private String empName;
	private double salary;
	private float experience;
	private Department department;

	public EmployeeC() {

	}

	public EmployeeC(int empId, String empName, double salary, float experience, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.experience = experience;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	

	@Override
	public String toString() {
		return "EmployeeC [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", experience="
				+ experience + ", department=" + department + "]";
	}

}
