package com.videoslvingrogram;

import java.util.Arrays;

public class MergeTwoArray {
	    public static void main(String[] args) {
	        int[] a1 = {1, 2, 3,5};
	        int[] a2 = {4, 5, 6,6};
	        int[] merged = new int[a1.length +a2.length];
	        
	        int index = 0;
	        for (int element : a1) {
	            merged[index] = element;
	            index++;
	        }
	        
	        for (int element : a2) {
	            merged[index] = element;
	            index++;
	        }
	        
	        System.out.println("Merged array: " + Arrays.toString(merged));
	    }
	
}
