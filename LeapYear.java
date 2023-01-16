import java.util.Scanner;

 class LeapYear
 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
	    int year=sc.nextInt();
		
		
		if ((year%4==0)&&(year%100!=0) || (year%400==0))
		{
		   System.out.println("This Year is  leap year.......");
		}
		else
		{
			System.out.println("this Year is not leap year.....");
		}
		
		

	}

}