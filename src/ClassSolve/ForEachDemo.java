package ClassSolve;

public class ForEachDemo {
	
	static void checkFor(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]+ar[i];
		}
		
	}
	
	static void checkForEach(int ar[])
	{
		for(int i:ar)
		{
           i=i+2;
              
		}
		
		
		
	}

	public static void main(String[] args) {

       int arr[]= {5,7,2,4,6,2,10};
       checkForEach(arr);
       
       for(int i:arr)
       {
    	   System.out.println(i);
       }
       
       

	}

}
