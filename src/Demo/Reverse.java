package Demo;

public class Reverse {

	public static void main(String[] args) {

		String str="mam";
		String rev=" ";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.endsWith(str))
		{
			System.out.println("yes");
		}
		else 
		{
			System.out.println("No");
		}
		
		
		//System.out.println(rev);
	}

}
