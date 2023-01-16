import java.util.Scanner;
class EqTrangle14
{
   public static void main(String agrs[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Area=>");
	  int a=sc.nextInt();
	  
      int area=(int)(1.73f*a*a)/4;
      System.out.println("Area of Equilateral Triangle is==>"+area);
    }
}