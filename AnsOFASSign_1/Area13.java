
import java.util.Scanner;
class Area13
{
   public static void main(String agrs[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the breadth=>");
	  int b=sc.nextInt();
	  
	  System.out.println("Enter the Hight=>");
	  int h=sc.nextInt();
	  
      int area=(b*h)/2;
	  System.out.println("Area of Triangle is==>"+area);
    }
}