import java.util.Scanner;
class DaysInMonth1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  month number=>");
	int month=sc.nextInt();
	
	if(month==1 || month==3 || month==5||month==6|| month==8|| month==10|| month==12)
	{
	  System.out.println("The day of this month is 31..");
	}
	else if(month==2)
	{
	   System.out.println("The number of days is 28 or 29 ");
    }
     else	
	{
	  System.out.println("The day of this month is 30..");
	}

  }
}
	