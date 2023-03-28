package Test;

public class Employee {

	/*
	 * Q5. Write a java program to create a class Employee(id, name, salary, age,
	 * experience) . Create 3 constructors as
	 *   Default
	 *   Constructor1(take experience as 0) 
	 *   Constructor2(taking all fields) Create a Employee test
	 * class in a separate package and create 4 objects of employee and then print
	 * them
	 */
	private int id;
	private String name;
	private int salary;
	private int experiance;

	public Employee(int id, String name, int salary, int experiance) {
		System.out.println("parameterized constructor 1....");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.experiance = experiance;
	}

	public Employee() {
		System.out.println("Default Constructor...............");
	}

	public Employee(int id, String name,int salary) {
		System.out.println("Default Constructor  2......");
		this.id = id;
		this.name = name;
		this.salary=50000000;
		this.experiance = 0;
	}
	
	@Override
	public String toString()
	{
		return "The details are => "+" id =>"+id+" Name=> "+name+" salary=>"+salary+" expriance "+experiance+"year";
	}

}
