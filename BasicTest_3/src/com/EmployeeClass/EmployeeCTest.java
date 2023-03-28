package com.EmployeeClass;

public class EmployeeCTest {

	public static void main(String[] args) {
		Department d1 = new Department(101, "IT", "Pune");
		Department d2 = new Department(102, "Computer Science", "Pune");
		Department d3 = new Department(103, "E&TC", "Pune");

		EmployeeC e1 = new EmployeeC(201, "Gaurav", 45000, 2, d1);
		EmployeeC e2 = new EmployeeC(202, "Suyog", 55000, 2, d2);
		EmployeeC e3 = new EmployeeC(203, "Omkar", 50000, 2, d3);
		EmployeeC e4 = new EmployeeC(204, "Vivek", 55000, 2, d2);
		EmployeeC e5 = new EmployeeC(205, "Pritish", 55000, 2, d1);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}

}
