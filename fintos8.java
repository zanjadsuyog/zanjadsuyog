import java.util.Scanner;
class  fintos8
{
	public static void main(String arge[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in fahrenheit=>");
		int f=sc.nextInt();
		int celsius = (f-32)*5/9;
		System.out.println("Fahrenheit  into Celsius=>"+celsius);
	}
}