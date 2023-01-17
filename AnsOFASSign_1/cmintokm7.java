class cmintokm6
import java.util.Scanner;
{
	public static void main(String arge[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length in centimeter=>");
		int cm=sc.nextInt();
		
		int meter=cm/100;
		int kilometer=cm/100000;
		 
		System.out.println("Centimeter into meter =>"+meter);
		System.out.println("Centimeter into kilometer =>"+kilometer);
		
		
	}
} 




