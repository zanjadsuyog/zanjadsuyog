import java.util.Scanner;
class cintof7
{
	public static void main(String arge[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in celsius=>");
		int c=sc.nextInt();
		int f = (c*9/5)+32;
		
		System.out.println("Celsius  into Fahrenheit=>"+f);
	}
}