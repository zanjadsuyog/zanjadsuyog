package ClassSolve;

public class EvenOddArray {
	
	static void sumEven(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum=sum+ar[i];
			}
		}
		
		ar[1]=10;
		
		System.out.println("Sum of even numbers:"+sum);
	}
	
	
	static int sumOdd(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
				sum=sum+ar[i];
			}
		}
		
      return sum;

	}
	

	static long productArray(int ar[])
	{
		int product=1;
		for(int i:ar)
		{
			product=product*i;
		}
		
      return product;

	}

	public static void main(String[] args) {

       int []myarr = new int[10];
       
       int arr[]= {3,5,6,7,2,11};
       System.out.println("Length of array:"+arr.length);
       System.out.println(arr[1]);
       
       sumEven(arr);
       
       System.out.println(arr[1]);
       
        int sumOd= sumOdd(arr);
        System.out.println("Sum of odd number :"+sumOd);
        
        System.out.println("Sum of odd numbers :"+sumOdd(arr));
        
        System.out.println("Product :"+productArray(arr));
            
       

	}

}
