package Test6;

public class WordAndChar {

		public static void characterdisplay(String s) {
			int characters = 0;
			for (int i = 0; i <s.length(); i++) {
				char c = s.charAt(i);
				characters++;
			}
			System.out.println("Total number of Character is:" + characters);
		}

		public static void Worddisplay(String s) {

	        int ct=1;
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
					ct++;
			}
				System.out.println("Total number of word: " +ct);

		}

		

		public static void main(String[] args) {

			String str = "This is a sample string.\n It has multiple lines and words.\n  suyog zanjad \n zanjad suyog";
			characterdisplay(str);
			Worddisplay(str);
			
			
		     
		}
	}


