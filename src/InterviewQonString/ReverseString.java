package InterviewQonString;

import java.util.Scanner;

  
  
public class ReverseString {
	public static void reverseDisplay(String str1)
	  {
		  
		String rev=" ";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println("The reverse string are: "+rev);
	  }

	

	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1=sc.next();
		
		String revString=" ";
		reverseDisplay(str1);
		
		
	}

}
