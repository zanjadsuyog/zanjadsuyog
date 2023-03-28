package BAsicTest5;

public class MaxAndMinElement {

//	Write a java program to find maximum and minimum from an array.
	public static void maxmin(int a[])
	{
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		
		}
		System.out.println("Maximun element is: "+max);
		System.out.println("Minimum element is: "+min);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 1, 5, 9, 8, 15 };

		maxmin(arr);
	//	System.out.println(Arrays.toString(arr));
	}

}
