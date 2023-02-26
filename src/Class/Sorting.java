package Class;

import java.util.Arrays;

public class Sorting {
	
	public static void sort(int a[])
	{
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		
		int a[]= {2,3,5,4,6,7,1,9};
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(a));
		
		sort(a);
		System.out.println("After  sorting:");
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
