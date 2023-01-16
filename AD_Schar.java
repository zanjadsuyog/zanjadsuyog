import java.util.Scanner;
class AD_Schar
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  any input=>");
	char input=sc.next().charAt(0);
	
	if(input>='a'  && input<='z')
	{
	System.out.println("The input is alphabet..");
	}
	if(input>='0'  && input<='9')
	{
	System.out.println("The input is digit..");
	}
	else
	{
		System.out.println("The input is special character..");
	}
	
  }
}