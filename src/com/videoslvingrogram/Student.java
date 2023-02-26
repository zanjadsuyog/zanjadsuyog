package com.videoslvingrogram;

import java.util.Arrays;

public class Student {

	int roll,marks[];
	String name;
	
	public Student()
	{
		
	}
	
	public  Student(int roll,String name,int[] marks)
	{
		this.roll=roll;
		this.marks=marks;
		this.name=name;
	}

	
	void display()
	{
		System.out.println("Roll number=>"+roll);
		System.out.println("Student marks=>"+name);
		System.out.println("Achived marks in differnt subject : ");
		
	/*	for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]+"  ");
		}
	*/
		System.out.println(Arrays.toString(marks));
	// 	System.out.println(marks);
		System.out.println("\n______________________________");
	}
	
	public static void main(String[] args) {

		int[] marks1= {82,73,49,63,95};
		int[] marks2= {88,73,45,63,45};
		
		Student s1=new Student(101,"Suyog",marks1);
		Student s2=new Student(102,"Omkar",marks2);
		s1.display();
		s2.display();


	}

}
