package InterviewQonString;

import java.util.Scanner;

public class ConcatString {
	
	public static void concatString(String s1,String s2)
	{
		
		String s3=s1+s2;
		System.out.println("After concatinatoin 2 string:  "+ s3);
	}
	
	

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string : ");
        String str1=scanner.next();
        System.out.println("Enter the Second string : ");
        String str2=scanner.next();
        
        concatString(str1, str2);
        
        
	}

}
