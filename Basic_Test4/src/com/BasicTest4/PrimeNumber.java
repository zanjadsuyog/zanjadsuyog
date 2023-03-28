package com.BasicTest4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

	//	Q2.Write a program to check the number is prime or not
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number=> ");
		int num=scanner.nextInt();
		
		int original=num;
		int flag=0;

		int m=0;
		m=num/2;
		if(num==1 && num==0)
		{
		System.out.println("The number is prime" );	
		}
		
		else
		{
			for(int i=2;i<=m;i++)
			{
				System.out.println(num+ "   is Not  prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+ "  is prime");
		}
		
	}


}
