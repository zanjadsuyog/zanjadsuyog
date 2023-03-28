package com.test7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(-9);
		al.add(-3);
		al.add(5);
		al.add(-7);
		al.add(10);
		al.add(12);

		
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(al.get(al.indexOf(1)));
        newList.add(al.get(al.indexOf(5)));
        newList.add(al.get(al.indexOf(5)));
        newList.add(al.get(al.indexOf(10)));
        newList.add(al.get(al.indexOf(12)));
        newList.add(al.get(al.indexOf(-3)));
        newList.add(al.get(al.indexOf(-7)));
        newList.add(al.get(al.indexOf(-9)));


        System.out.println(newList);
	}
}
