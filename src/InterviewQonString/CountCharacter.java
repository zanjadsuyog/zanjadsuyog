package InterviewQonString;

public class CountCharacter {

	public static int dislay(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				count++;
		}
				
		return count;
	}

	public static void main(String[] args) {

		String str="maharashtra";
		System.out.println(str);
		
		int count=dislay(str);
		
		System.out.println("Total numner of character: "+count);
		
	}

}
