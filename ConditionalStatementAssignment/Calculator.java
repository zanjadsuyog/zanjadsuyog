
import java.util.Scanner;
class Calculator
{
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator /,*,+,-,%..:");
		
		char ch=sc.next().charAt(0);
		System.out.println("Enter First number number....: ");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number....:");
		double num2=sc.nextDouble();
		
		if(ch=='+')
		    {
		      System.out.printf("addition is...:"+(num1+num2));
		    }
			else if(ch=='-')
			{
				System.out.printf("Substraction  is...:"+(num1-num2));
			}
			else if(ch=='/')
			{
				System.out.printf("Divitation is...:"+(num1/num2));
			}
			else if(ch=='*')
			{
				System.out.printf("Multiplecation is...:"+(num1*num2));
			}
			else if(ch=='%')
			{
				System.out.printf("modulus is..:"+(num1%num2));
			}
			else 
			{
				System.out.println("invalid operator");
			}
	}
}






