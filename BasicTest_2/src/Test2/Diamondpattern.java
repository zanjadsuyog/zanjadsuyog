package Test2;

public class Diamondpattern {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*	for(int i=1;i<=5;i++)
			{
				for(int j=1;i<=i;j++)
				{
					System.out.println("*");
				}
			}
			System.out.println();
		}
		*/
	}
}
