import java.util.Scanner;
class  DintoY9
{
	public static void main(String arge[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the days=>");
		int days=sc.nextInt();
		
		int year=days/365;
		int weeks=(days/7);
		
		System.out.println("Day intto year=> "+year);
		
		
		System.out.println("Day intto weeks=> "+weeks);
		
		
	}
}
