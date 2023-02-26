package InterviewQonString;

import java.util.Scanner;

public class LengthstringWithoutinbultmethod {

	public static void  display(String str1)
	{
		int length=0;
		
		for(int i=0;i<str1.length();i++)
		{
			length++;
		}
		System.out.println("Length of string is: "+length);

		
		
		
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String str1=sc.next();
		
		display(str1);
		
	}

}
