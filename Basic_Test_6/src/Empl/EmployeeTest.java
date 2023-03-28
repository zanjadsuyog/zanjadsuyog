package Empl;

public class EmployeeTest {

	public static void salarySort(Employee emp1[]) {
		System.out.println("----------------------");
		for (Employee e1 : emp1) {
			System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		}
		Employee e = new Employee();// acts as a temperory employee.

		for (int i = 0; i < emp1.length; i++) {
			for (int j = i + 1; j < emp1.length; j++) {
				if (emp1[i].getSalary() < emp1[j].getSalary()) {
					e = emp1[i];
					emp1[i] = emp1[j];
					emp1[j] = e;
				}
			}

		}
		System.out.println("-----------------");
		System.out.println("After sorting the salary in decreasing order....");
		for (Employee e1 : emp1) {

			System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		}

	}

	public static void main(String[] args) {

		Employee emp[] = new Employee[5];
		emp[0] = new Employee(1, "Vivek", 35000f);
		emp[1] = new Employee(2, "Suyog", 45000f);
		emp[2] = new Employee(3, "Omkar", 55000f);
		emp[3] = new Employee(4, "Aniket", 65000f);
		emp[4] = new Employee(5, "Sahil", 75000f);

		salarySort(emp);

	}
}
