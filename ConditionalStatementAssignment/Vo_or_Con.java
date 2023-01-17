
import java.util.Scanner;
class Vo_or_Con
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter any alphabet: ");
		char ch=sc.next().charAt(0);
		
		if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
		{
			System.out.println("is vowel...:"+ch);
			
		}
		else
		{
			System.out.println("is consonant...:"+ch);
			
		}
		

	}

}