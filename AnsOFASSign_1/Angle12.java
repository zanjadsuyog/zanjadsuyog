import java.util.Scanner;
class Angle12
{
   public static void main(String agrs[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the two angle=>");
	  int a1=sc.nextInt();
	  int a2=sc.nextInt();
	  
	  int a3=180-(a1+a2);
	  System.out.println("The third angle is =>"+a3);
	}
}
	  
	  