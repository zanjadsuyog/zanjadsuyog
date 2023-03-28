package Test2;

import Test.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1=new Employee();
		System.out.println(e1.toString());
		System.out.println("___________________________________");
		
		Employee e2=new Employee(12,"Suyog",200000,4);
		System.out.println(e2.toString());

		System.out.println("___________________________________");
		
		Employee e3=new Employee(13,"omkar",3);
		System.out.println(e3.toString());

		System.out.println("___________________________________");
	}

}
