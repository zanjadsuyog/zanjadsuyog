package Test;

import java.util.Scanner;

public class Student {

	/*
	 * Q1. Write a program to create a class Student having fields id, name, marks
	 * (private). Create getter , setters and toString method. Create a Student test
	 * class in which create 3 objects . Take the input from the user and then
	 * display the details of all the students.
	 */

	private int id;
	private String name;
	private float marks;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Details Are=>"+"id= "+ id + "  name=>  " + name + "  marks=>  " + marks;
	}

	void getdetails()
	{
	Scanner scanner=new Scanner(System.in);	
	//System.out.println("Details for 1st student=>");
	System.out.println("Enter the student id: ");
	this.id=scanner.nextInt();
	System.out.println("Enter the student name: ");
	this.name=scanner.next();

	System.out.println("Enter the student marks: ");
	this.marks=scanner.nextFloat();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
    	System.out.println("Details for 1st student=>");
    	s1.getdetails();

		System.out.println("***************************");
		System.out.println("Details for second student");
		Student s2 = new Student();
		s2.getdetails();
		
		
		System.out.println("***************************");
		System.out.println("Details for Third student");
 		Student s3 = new Student();
		s3.getdetails();
		System.out.println("__________________________________________________________");
		System.out.println("Details of all student are=>");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}
}
