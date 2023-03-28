package Test;

import java.util.Scanner;

public class CountryCode {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the country name: ");
		String c=scanner.next();
		
		switch (c) {
		case "india": {
			System.out.println("pincode =10");
			System.out.println("capital = new Delhi");
			System.out.println("17897");	
			break;
		}
		case "china": {
			System.out.println("pincode = 19");
			System.out.println("capital = Beling");
			System.out.println("area = 874997");	
			break;
		}
		
		case "japan": {
			System.out.println("pincode = 19");
			System.out.println("capital = Tokyo");
			System.out.println("area = 874997");	
			break;
		}
		case "pakistan": {
			System.out.println("pincode = 373");
			System.out.println("capital = Islamabad");
			System.out.println("area = 19970974");
			break;
		}
		case "cuba": {
			System.out.println("pincode = 78");
			System.out.println("capital = hawana");
			System.out.println("area = 3167642");	
			break;
		}
		case "peru": {
			System.out.println("pincode = 8989");
			System.out.println("capital = lima");
			System.out.println("area = 824354397");	
			break;
		}
		case "afganistan": {
			System.out.println("pincode = 23");
			System.out.println("capital = kabul");
			System.out.println("area = 874997");	
			break;
		}
		case "iran": {
			System.out.println("pincode = 854");
			System.out.println("capital = baghadh");
			System.out.println("area = 76676777797");	
			break;
			
		}
		case "monaco": {
			System.out.println("pincode = 854");
			System.out.println("capital = monaco");
			System.out.println("area = 76676777797");	
			break;
		}
		default:
			System.out.println("Invalid input.......");
		}
	}

}
