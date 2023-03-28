package com.BasicTest4;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number::  ");
		int num=sc1.nextInt();
		int rev=0,rem;
		
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;	
		}
		System.out.println("The rev num are :"+rev);
	}

}
