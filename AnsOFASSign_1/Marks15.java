import java.util.Scanner;
class  Marks15
{
	public static void main(String arge[])
	{
		int total,avg;
		float perc;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of five subject=>");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		
		total=m1+m2+m3+m4+m5;
		avg=total/5;
		perc=(int)total/5;
		
		System.out.println("total marks is=>"+total);
		
		System.out.println("Average is=>"+avg);

		System.out.println("Percentage  is=>"+perc);
    }
}
		