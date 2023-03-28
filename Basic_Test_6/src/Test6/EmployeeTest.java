package Test6;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);

	public static void getEmployeeDetails(Employee e) {
		System.out.println("Enter employee id:");
		e.setEmpId(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setEmpName(sc.next());

		System.out.println("Enter Salary");
		e.setSalary(sc.nextDouble());

		e.setDept(new Department());
		System.out.println("Enter department id:");
		e.getDept().setDeptId(sc.nextInt());

		System.out.println("Enter department name:");
		e.getDept().setDeptName(sc.next());
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[4];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			getEmployeeDetails(emp[i]);
			System.out.println(emp[i]);
		}
		System.out.println(Arrays.toString(emp));

		for (int j = 0; j < emp.length; j++) {
			System.out.println(emp[j]);
			double temp = 0;
			double sal1 = emp[j].getSalary();
			for (int k = j + 1; k < emp.length; k++) {
				if (sal1 < emp[k].getSalary()) {
					double sal2 = emp[k].getSalary();
					temp = sal2;
					sal1 = sal2;
					sal2 = temp;
				}
			}
		}
	}
}
