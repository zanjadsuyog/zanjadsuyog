package Demo;

public class Duplicate {

	public static void display(int a[])
	{
		System.out.println("Duplicate element in given array:  ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Element: "+a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {

		int arr[]= {2,4,3,5,6,7,8,7,6,5,4};
		
//	System.out.println(Arrays.toString(arr));
	
	Duplicate.display(arr);
		
	}

}
