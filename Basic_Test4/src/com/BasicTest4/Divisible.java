package com.BasicTest4;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
// Write a program to display the number divisible by 3 from 1 to n numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=>  ");
		int num=sc.nextInt();
        
		for(int i=1;i<=num;i++)
		{
			if(i%3==0)
			{
				System.out.println("Is divisible by 3 :"+i);
			}
		}
		
	}

}
