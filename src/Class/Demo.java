package Class;

public class Demo {

	public static void main(String[] args) {

		int arr1[]= {2,3,4,5,6,1};
		int arr2[]= {4,3,5,6,7,8};
		
		
		boolean temp=true;
		for(int i=0;i<=arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
				
			{
				if(arr1[i]==arr2[j])
				{
					
					temp=true;
							break;
				}
			}
			if (temp) {
	            break;
	         }
	      }
	      if (!temp) {
	         System.out.println("Element not found in array2");
		}
	}

}
