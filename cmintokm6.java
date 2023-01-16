
import java.util.Scanner;
class cmintokm6
{
	public static void main(String arge[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length in centimeter=>");
		float cm=sc.nextInt();
		
		float meter=cm/100.0f;
		float kilometer=cm/100000.0f;
		 
		System.out.println("Centimeter into meter =>"+meter);
		System.out.println("Centimeter into kilometer =>"+kilometer);
		
		
	}
} 




