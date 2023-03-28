 package com.test7;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		// Write a program to show different ways to iterate in arraylist?
		
		
		// using for loop.
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");

		System.out.println("******************************");
		System.out.println("using for loop...");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//using forEach_loop
		System.out.println("******************************");
		System.out.println("using forEach_loop...");
		for (String fruit : list) {
		    System.out.println(fruit);
		}
		
		//by using while loop
		System.out.println("******************************");
		System.out.println("using while loop...");

		int i = 0;
		while (i < list.size()) {
		    System.out.println(list.get(i));
		    i++;
		}
		
		// by using iterator
		System.out.println("******************************");
		System.out.println("using iteroator...");

		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}

	}

}
