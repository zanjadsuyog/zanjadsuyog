import java.util.Scanner;
class DaysInMonth
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  month=>");
	String month=sc.next();
	
	if(month=="january" )
	{
	  System.out.println("The day is 31");
	}
	
	 else if(month=="february")
	{
	  System.out.println("The day is 28 or 29");
    }
	 else if(month=="march")
	{
	  System.out.println("The day is 31");
    }
	 else if(month=="april")
	{
	  System.out.println("The day is 30");
    }
	 else if(month=="may")
	{
	  System.out.println("The day is 31");
    }
	 else if(month=="june")
	{
	  System.out.println("The day is 30");
    }
	
	 else if(month=="july")
	{
	  System.out.println("The day is 31");
    }
	
	 else if(month=="august")
	{
	  System.out.println("The day is 31");
    }
	
	 else if(month=="September")
	{
	  System.out.println("The day is 30");
    }
	
	 else if(month=="octomber")
	{
	  System.out.println("The day is 31");
    }
	
	else if(month=="november")
	{
	  System.out.println("The day is 30");
    }
	
    else if(month=="december")
	{
	  System.out.println("The day is 31");
    }
	
     else
	{
	 	  System.out.println("Invalid input:");
    }
	
  }
 }