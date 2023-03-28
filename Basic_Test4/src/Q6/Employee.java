package Q6;

public class Employee {

//	Write a program to implement inheritance for Employee which is inherited by Manager.
//	Override the  method incrementSalary.

	public int  incrementsalary(int currentsalary) {
		int IncrementalSalary = currentsalary + 2000;
		System.out.println("Increment salary of Employee" + IncrementalSalary);
		return IncrementalSalary;
	}
}
	class Manager extends Employee {
		@Override
		public int incrementsalary(int currentsalary) {

			System.out.println("Increment salary of Manager");
			return currentsalary;
		}


	public static void main(String[] args) {

		Manager m1=new Manager();
		m1.incrementsalary(5000);
	
	}
}