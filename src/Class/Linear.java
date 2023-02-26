package Class;

import java.util.Scanner;

public class Linear {
	
	   public static void printing(int a[])
	   {
		   System.out.println(a);
	   }
	

	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter the element=");

		for(int i=0;i<7;i++)
		{
			a[i]=sc1.nextInt();
		}
		
		printing(a);
	}

}
