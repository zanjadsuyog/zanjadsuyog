import java.util.Scanner;

class Ci16
{
    public static void main(String[] args) 
	{
	
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal =>");
        float p =sc.nextFloat();
		System.out.println("Enter the time =>");
        float t =sc.nextFloat();
		System.out.println("Enter the compound intrest =>");
        float r =sc.nextFloat();
       
 
        float CI = (float)(p * (Math.pow((1 + r / 100), t)));
        System.out.println("Compound Interest =>" + CI);
    } 
  }