import java.util.Scanner;
class Bmis
{
	public static void main(String arge[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hight=>");
		double hight=sc.nextDouble();
		
		System.out.println("enter the weight=>");
		double weight=sc.nextDouble();
		hight=hight*2.54;
		double bmi=weight/(hight*hight);
		
		System.out.println("The body mass index is:"+bmi);
		
	}
}
		
		
		