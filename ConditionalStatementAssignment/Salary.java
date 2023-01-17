import java.util.Scanner;
class Salary
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the basic salary");
    int bsalary=sc.nextInt();
    float hra=0;
    float da=0;
    if(bsalary<=10000)
    {
     da= (bsalary*0.8f);
     hra= (bsalary*0.2f);
	}
    if(bsalary<=20000)
    {
     da= (bsalary*0.9f);
     hra= (bsalary*0.25f);
    }
     if(bsalary>20000)
    { 
      da= (bsalary*0.95f);
      hra= (bsalary*0.3f);
    }
   
     int Gross_salary=(int ) (bsalary + da + hra);
     System.out.println("Employee Gross salary is=> "+ Gross_salary);
  }
}


