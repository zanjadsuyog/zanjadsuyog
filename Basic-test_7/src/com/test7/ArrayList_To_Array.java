package com.test7;
import java.util.ArrayList;

public class ArrayList_To_Array {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		String[] array = new String[arrayList.size()];
		array = arrayList.toArray(array);

		System.out.println("Elements of Array:");
		for (String fruit : array) {
			System.out.println(fruit);
		}
	}

}
