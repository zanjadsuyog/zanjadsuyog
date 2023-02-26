package Demo;

public class StringBuffAndBulComp {
	
	public static void buffer(StringBuffer sb1)
	{
		long starttime=System.currentTimeMillis();
		for(int i=0;i<10000;i++)
		{
			sb1.append("program");
		}
		System.out.println("StringBuffer: "+System.currentTimeMillis()-starttime);
	}

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("java");
		
		
		
	}
}
