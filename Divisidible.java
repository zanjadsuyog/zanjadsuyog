import java.util.Scanner;

class Divisidible
 { 
      public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any number : ");
       int num=sc.nextInt();
       
       if((num%5==0) && (num%11==0))
       {
    	   System.out.println("number is divisible 5 & 11.....");
       }
       else 
       {
    	   System.out.println("number is not divisible by 5 & 11");
       }
       
    }
}