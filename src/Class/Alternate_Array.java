package Class;

import java.util.Scanner;

public class Alternate_Array {

	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter the element=");

		for(int i=0;i<7;i++)
		{
		//	System.out.println("Enter the element=");
			a[i]=sc1.nextInt();
		}
		System.out.println("********************");
		
		System.out.println("Alternate Element printing=>");
		for(int i=0;i<7;i=i+2)
		{
			System.out.println(i);
		}
	}

}
