package com.StudentClass;

public class Student {

//	Q2. Write a java program to create a Student class (id, name, age, marks).
//	Create constructors, getter, setter and to string method. 
//	Create another class and create 2 object of student class and print the details.
//	Also calculate how many students are registered (Hint: Static)

	private int id;
	private String name;
	private int age;
	private int marks;
	 static int counter=0;

	
	
	public Student(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
		
		{
			counter++;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getCount() {
		return counter;
	}

	public void setCount(int count) {
		this.counter = count;
	}
	
	@Override
	public String toString()
	{
		 return "Student details:  "+id +"  "+name+"  "+age+"   "+marks;
	}

}
