package InterviewQonString;

public class CountNumberOfWorld {

	public static void display(String str)
	{
		String []inword=str.split("\s+");
		int countwords=inword.length;
		System.out.println("Total number of words: "+countwords);
		
	}
	public static void main(String[] args) {

		
		String str="my name is  zanjad suyog Haribhau";
		
		display(str);
		
	}

}
